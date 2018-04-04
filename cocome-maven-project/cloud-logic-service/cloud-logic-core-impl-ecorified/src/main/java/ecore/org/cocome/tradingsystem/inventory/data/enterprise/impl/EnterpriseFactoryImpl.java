package ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl;

import org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseDatatypesFactory;
import org.cocome.tradingsystem.inventory.data.enterprise.Product;
import org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier;
import org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseFactory;
import ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage;

/**
 * An implementation of the model <b>Factory</b>.
 * @generated
 */
public class EnterpriseFactoryImpl extends EFactoryImpl implements EnterpriseFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static EnterpriseFactory init() {
        try {
            EnterpriseFactory theEnterpriseFactory = (EnterpriseFactory)EPackage.Registry.INSTANCE.getEFactory(EnterprisePackage.eNS_URI);
            if (theEnterpriseFactory != null) {
                return theEnterpriseFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new EnterpriseFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * @generated
     */
    public EnterpriseFactoryImpl() {
        super();
    }

    /**
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
			case EnterprisePackage.ENTERPRISE_DATATYPES_FACTORY: return createEnterpriseDatatypesFactory();
			case EnterprisePackage.PRODUCT: return createProduct();
			case EnterprisePackage.PRODUCT_SUPPLIER: return createProductSupplier();
			case EnterprisePackage.TRADING_ENTERPRISE: return createTradingEnterprise();
			default:
			    throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
			     }
			 }
	
	/**
	 * @generated
	 */
	public EnterpriseDatatypesFactory createEnterpriseDatatypesFactory() {
		return new EnterpriseDatatypesFactory(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public Product createProduct() {
		return new Product(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public ProductSupplier createProductSupplier() {
		return new ProductSupplier(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public TradingEnterprise createTradingEnterprise() {
		return new TradingEnterprise(); // origin code instance
	}	
	
	/**
	 * @generated
	 */
	public EnterprisePackage getEnterprisePackage() {
	return (EnterprisePackage)getEPackage();
	}

    /**
     * @deprecated
     * @generated
     */
    @Deprecated
    public static EnterprisePackage getPackage() {
        return EnterprisePackage.eINSTANCE;
    }
    
} //EnterpriseFactoryImpl
