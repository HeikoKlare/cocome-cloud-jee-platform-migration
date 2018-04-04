package org.cocome.tradingsystem.inventory.data.persistence;

import java.io.IOException;

import javax.ejb.CreateException;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.cocome.tradingsystem.inventory.data.enterprise.IProduct;
import org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier;
import org.cocome.tradingsystem.inventory.data.enterprise.ITradingEnterprise;
import org.cocome.tradingsystem.inventory.data.store.IProductOrder;
import org.cocome.tradingsystem.inventory.data.store.IStockItem;
import org.cocome.tradingsystem.inventory.data.store.IStore;
import org.cocome.tradingsystem.inventory.data.usermanager.ICustomer;
import org.cocome.tradingsystem.inventory.data.usermanager.IUser;
import org.cocome.tradingsystem.remote.access.connection.IPersistenceConnection;

@Stateless
@Local(IPersistenceContext.class)
public class CloudPersistenceContext extends unification.org.cocome.tradingsystem.inventory.data.persistence.UnifiedCloudPersistenceContext implements IPersistenceContext {
	// TODO make these calls asynchronous by pushing them into a JMS queue
	// and implement bean that asynchronously tries to persist the changes
	
	// TODO create query class to hold information about the queries

	private static Logger LOG = Logger.getLogger(CloudPersistenceContext.class);
	
	@Inject
	private
	IPersistenceConnection postData;
	
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void updateEntity(IProductOrder productOrder) throws UpdateException {
		String content = ServiceAdapterEntityConverter.getProductOrderContent(productOrder);
		
		try {
			getPostData().sendUpdateQuery("ProductOrder", ServiceAdapterHeaders.getPRODUCTORDER_HEADER(), content);
		} catch (IOException e) {
			getLOG().error("Could not execute post because of an IOException: " + e.getMessage());
			throw new UpdateException("Could not update entity!", e);
		}
		
		String response = getPostData().getResponse();
		
		if(response.contains("FAIL") || !response.contains("SUCCESS")) {
			throw new UpdateException("Could not update entity!");
		}
	}

	IPersistenceConnection getPostData() {
		return postData;
	}

	void setPostData(IPersistenceConnection postData) {
		this.postData = postData;
	}

	private static Logger getLOG() {
		return LOG;
	}

	private static void setLOG(Logger lOG) {
		LOG = lOG;
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void createEntity(IStockItem stockItem) throws CreateException {
		String content = ServiceAdapterEntityConverter.getStockItemContent(stockItem);
		try {
			getPostData().sendCreateQuery("StockItem", ServiceAdapterHeaders.getSTOCKITEM_HEADER(), content);
		} catch (IOException e) {
			getLOG().error("Could not execute post because of an IOException: " + e.getMessage());
			throw new CreateException("Could not create entity!");
		}
		
		if(!getPostData().getResponse().contains("SUCCESS")) {
			throw new CreateException("Could not create entity!");
		}
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void updateEntity(IStockItem stockItem) throws UpdateException {
		String content = ServiceAdapterEntityConverter.getStockItemContent(stockItem);
		
		try {
			getPostData().sendUpdateQuery("StockItem", ServiceAdapterHeaders.getSTOCKITEM_HEADER(), content);
		} catch (IOException e) {
			getLOG().error("Could not execute post because of an IOException: " + e.getMessage());
			throw new UpdateException("Could not update entity!", e);
		}
		
		if(!getPostData().getResponse().contains("SUCCESS")) {
			throw new UpdateException("Could not update entity!");
		}
	}

	@Override
	public void createEntity(ITradingEnterprise enterprise) throws CreateException {
		String content = ServiceAdapterEntityConverter.getCreateEnterpriseContent(enterprise);
		try {
			getPostData().sendCreateQuery("enterprise", ServiceAdapterHeaders.getENTERPRISE_CREATE_HEADER(), content);
		} catch (IOException e) {
			getLOG().error("Could not execute post because of an IOException: " + e.getMessage());
			throw new CreateException("Could not create entity! " + e.getMessage());
		}
		
		if(!getPostData().getResponse().contains("SUCCESS")) {
			throw new CreateException("Could not create entity!");
		}
	}

	@Override
	public void createEntity(IProductOrder productOrder) throws CreateException {
		String content = ServiceAdapterEntityConverter.getProductOrderContent(productOrder);
		try {
			getPostData().sendCreateQuery("ProductOrder", ServiceAdapterHeaders.getPRODUCTORDER_HEADER(), content);
		} catch (IOException e) {
			getLOG().error("Could not execute post because of an IOException: " + e.getMessage());
			throw new CreateException("Could not create entity!");
		}
		
		if(getPostData().getResponse().contains("FAIL") || !getPostData().getResponse().contains("SUCCESS")) {
			throw new CreateException("Could not create entity!");
		}
	}

	@Override
	public void updateEntity(ITradingEnterprise enterprise) throws UpdateException {
		String content = ServiceAdapterEntityConverter.getUpdateEnterpriseContent(enterprise);
		
		try {
			getPostData().sendUpdateQuery("Enterprise", ServiceAdapterHeaders.getENTERPRISE_UPDATE_HEADER(), content);
		} catch (IOException e) {
			// TODO perhaps throw this exception to caller?
			getLOG().error("Could not execute post because of an IOException: " + e.getMessage());
			throw new UpdateException("Could not update entity!", e);
		}
		
		if(!getPostData().getResponse().contains("SUCCESS")) {
			throw new UpdateException("Could not update entity!");
		}
		
	}

	@Override
	public void createEntity(IStore store) throws CreateException {
		String content = ServiceAdapterEntityConverter.getCreateStoreContent(store);
		try {
			getPostData().sendCreateQuery("Store", ServiceAdapterHeaders.getSTORE_CREATE_HEADER(), content);
		} catch (IOException e) {
			getLOG().error("Could not execute post because of an IOException: " + e.getMessage());
			throw new CreateException("Could not create entity!");
		}
		
		if(!getPostData().getResponse().contains("SUCCESS")) {
			throw new CreateException("Could not create entity!");
		}
	}

	@Override
	public void updateEntity(IStore store) throws UpdateException {
		String content = ServiceAdapterEntityConverter.getUpdateStoreContent(store);
		
		try {
			getPostData().sendUpdateQuery("Store", ServiceAdapterHeaders.getSTORE_UPDATE_HEADER(), content);
		} catch (IOException e) {
			getLOG().error("Could not execute post because of an IOException: " + e.getMessage());
			throw new UpdateException("Could not create entity!", e);
		}
		
		if(!getPostData().getResponse().contains("SUCCESS")) {
			throw new UpdateException("Could not update entity!");
		}
	}

	@Override
	public void createEntity(IProductSupplier supplier) throws CreateException {
		String content = ServiceAdapterEntityConverter.getCreateSupplierContent(supplier);
		try {
			getPostData().sendCreateQuery("ProductSupplier", ServiceAdapterHeaders.getPRODUCTSUPPLIER_CREATE_HEADER(), content);
		} catch (IOException e) {
			getLOG().error("Could not execute post because of an IOException: " + e.getMessage());
			throw new CreateException("Could not create entity!");
		}
		
		if(!getPostData().getResponse().contains("SUCCESS")) {
			throw new CreateException("Could not create entity!");
		}
	}

	@Override
	public void updateEntity(IProductSupplier supplier) throws UpdateException {
		String content = ServiceAdapterEntityConverter.getUpdateSupplierContent(supplier);
		
		try {
			getPostData().sendUpdateQuery("ProductSupplier", ServiceAdapterHeaders.getPRODUCTSUPPLIER_UPDATE_HEADER(), content);
		} catch (IOException e) {
			getLOG().error("Could not execute post because of an IOException: " + e.getMessage());
			throw new UpdateException("Could not update entity!", e);
		}
		
		if(!getPostData().getResponse().contains("SUCCESS")) {
			throw new UpdateException("Could not update entity!");
		}
	}

	@Override
	public void createEntity(IProduct product) throws CreateException {
		String content = ServiceAdapterEntityConverter.getProductContent(product);
		try {
			getPostData().sendCreateQuery("Product", ServiceAdapterHeaders.getPRODUCT_HEADER(), content);
		} catch (IOException e) {
			getLOG().error("Could not execute post because of an IOException: " + e.getMessage());
			throw new CreateException("Could not create entity!");
		}
		
		if(!getPostData().getResponse().contains("SUCCESS")) {
			throw new CreateException("Could not create entity!");
		}
	}

	@Override
	public void updateEntity(IProduct product) throws UpdateException {
		String content = ServiceAdapterEntityConverter.getProductContent(product);
		
		try {
			getPostData().sendUpdateQuery("Product", ServiceAdapterHeaders.getPRODUCT_HEADER(), content);
		} catch (IOException e) {
			getLOG().error("Could not execute post because of an IOException: " + e.getMessage());
			throw new UpdateException("Could not update entity!", e);
		}
		
		if(!getPostData().getResponse().contains("SUCCESS")) {
			throw new UpdateException("Could not update entity!");
		}
	}

	@Override
	public void createEntity(Object entity) throws CreateException {
		if (entity instanceof ITradingEnterprise) {
			createEntity((ITradingEnterprise) entity);		
		} else if (entity instanceof IStore) {
			createEntity((IStore) entity);
		} else if (entity instanceof IProduct) {
			createEntity((IProduct) entity);
		} else if (entity instanceof IProductOrder) {
			createEntity((IProductOrder) entity);
		} else if (entity instanceof IStockItem) {
			createEntity((IStockItem) entity);
		} else if (entity instanceof IProductSupplier) {
			createEntity((IProductSupplier) entity);
		} else {
			throw new CreateException("The entity with class " + entity.getClass() + " is not recognized and can not be created!");
		}
	}

	@Override
	public void updateEntity(Object entity) throws UpdateException {
		if (entity instanceof ITradingEnterprise) {
			updateEntity((ITradingEnterprise) entity);		
		} else if (entity instanceof IStore) {
			updateEntity((IStore) entity);
		} else if (entity instanceof IProduct) {
			updateEntity((IProduct) entity);
		} else if (entity instanceof IProductOrder) {
			updateEntity((IProductOrder) entity);
		} else if (entity instanceof IStockItem) {
			updateEntity((IStockItem) entity);
		} else if (entity instanceof IProductSupplier) {
			updateEntity((IProductSupplier) entity);
		} else {
			throw new UpdateException("The entity with class " + entity.getClass() + " is not recognized and can not be updated!");
		}		
	}

	@Override
	public void createEntity(IUser user) throws CreateException {
		String content = ServiceAdapterEntityConverter.getUserContent(user);
		try {
			getPostData().sendCreateQuery("LoginUser", ServiceAdapterHeaders.getUSER_CREATE_HEADER(), content);
		} catch (IOException e) {
			getLOG().error("Could not execute post because of an IOException: " + e.getMessage());
			throw new CreateException("Could not create entity!");
		}
		
		if(!getPostData().getResponse().contains("SUCCESS")) {
			throw new CreateException("Could not create entity!");
		}
	}

	@Override
	public void updateEntity(IUser user) throws UpdateException {
		String content = ServiceAdapterEntityConverter.getUserContent(user);
		try {
			getPostData().sendUpdateQuery("LoginUser", ServiceAdapterHeaders.getUSER_UPDATE_HEADER(), content);
		} catch (IOException e) {
			getLOG().error("Could not execute post because of an IOException: " + e.getMessage());
			throw new UpdateException("Could not connect to the database!");
		}
		
		if(!getPostData().getResponse().contains("SUCCESS")) {
			throw new UpdateException("Could not create entity!");
		}
	}

	@Override
	public void createEntity(ICustomer customer) throws CreateException {
		String content = ServiceAdapterEntityConverter.getCustomerContent(customer);
		
		// TODO Transactions would be good here
		createEntity(customer.getUser());
		
		try {
			getPostData().sendCreateQuery("Customer", 
					customer.getPreferredStore() == null ? 
							ServiceAdapterHeaders.getCUSTOMER_CREATE_HEADER() 
							: ServiceAdapterHeaders.getCUSTOMER_CREATE_HEADER_WITH_STORE(),
					content);
		} catch (IOException e) {
			getLOG().error("Could not execute post because of an IOException: " + e.getMessage());
			throw new CreateException("Could not create entity!");
		}
		
		if(!getPostData().getResponse().contains("SUCCESS")) {
			throw new CreateException("Could not create entity!");
		}
	}

	@Override
	public void updateEntity(ICustomer customer) throws UpdateException {
		String content = ServiceAdapterEntityConverter.getUpdateCustomerContent(customer);
		
		try {
			getPostData().sendUpdateQuery("Customer", 
					customer.getPreferredStore() == null ? 
							ServiceAdapterHeaders.getCUSTOMER_UPDATE_HEADER() 
							: ServiceAdapterHeaders.getCUSTOMER_UPDATE_HEADER_WITH_STORE(),
					content);
		} catch (IOException e) {
			getLOG().error("Could not execute post because of an IOException: " + e.getMessage());
			throw new UpdateException("Could not connect to the database!");
		}
		
		if(!getPostData().getResponse().contains("SUCCESS")) {
			throw new UpdateException("Could not create entity!");
		}
	}
	
	
}
