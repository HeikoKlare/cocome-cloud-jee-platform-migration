package org.cocome.cloud.webservice.enterpriseservice;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.cocome.cloud.logic.stub.CreateException_Exception;
import org.cocome.cloud.logic.stub.IEnterpriseManager;
import org.cocome.cloud.logic.stub.NotInDatabaseException_Exception;
import org.cocome.tradingsystem.inventory.application.plant.PlantTO;
import org.cocome.tradingsystem.inventory.application.store.EnterpriseTO;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class EnterpriseManagerTest {

    private static IEnterpriseManager em;

    @BeforeClass
    public static void createClient() {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(IEnterpriseManager.class);
        factory.setAddress("http://127.0.0.1:40797/EnterpriseService/IEnterpriseManager");
        em = (IEnterpriseManager) factory.create();
    }

    @Test
    public void retrieveAndDeleteEnterprises() throws Exception {
        if (em.getEnterprises() == null) {
            em.createEnterprise("TestEnterprise");
        }
        for (final EnterpriseTO e : em.getEnterprises()) {
            em.deleteEnterprise(e);
        }
        Assert.assertNotNull(em.getEnterprises());
        Assert.assertTrue(em.getEnterprises().isEmpty());
    }

    @Test
    public void createAndDeletePlant() throws Exception {
        final EnterpriseTO enterprise = getOrCreateEnterprise("TestEnterprise");
        PlantTO plant = new PlantTO();
        plant.setName("Plant1");
        plant.setLocation("Some Location");
        plant.setEnterpriseTO(enterprise);
        em.createPlant(plant);
        for(final PlantTO plantTO : em.queryPlantsByEnterpriseID(enterprise.getId())) {
            em.deletePlant(plantTO);
        }
        em.deleteEnterprise(enterprise);
    }

    private EnterpriseTO getOrCreateEnterprise(final String enterpriseName) throws CreateException_Exception, NotInDatabaseException_Exception {
        final EnterpriseTO enterprise;
        try {
            enterprise = em.queryEnterpriseByName(enterpriseName);
        } catch (NotInDatabaseException_Exception e) {
            em.createEnterprise(enterpriseName);
            return em.queryEnterpriseByName(enterpriseName);
        }
        return enterprise;
    }
}