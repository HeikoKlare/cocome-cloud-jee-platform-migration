/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.persistence;

import javax.ejb.CreateException;

import org.cocome.tradingsystem.inventory.data.enterprise.IProduct;
import org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier;
import org.cocome.tradingsystem.inventory.data.enterprise.ITradingEnterprise;
import org.cocome.tradingsystem.inventory.data.persistence.UpdateException;
import org.cocome.tradingsystem.inventory.data.store.IProductOrder;
import org.cocome.tradingsystem.inventory.data.store.IStockItem;
import org.cocome.tradingsystem.inventory.data.store.IStore;
import org.cocome.tradingsystem.inventory.data.usermanager.ICustomer;
import org.cocome.tradingsystem.inventory.data.usermanager.IUser;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Persistence Context</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ecore.org.cocome.tradingsystem.inventory.data.persistence.PersistencePackage#getCloudPersistenceContext()
 * @model
 * @generated
 */
public interface CloudPersistenceContext extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.org.cocome.tradingsystem.inventory.data.persistence.UpdateException" productOrderDataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.IProductOrder"
	 * @generated
	 */
	void updateEntity(IProductOrder productOrder) throws UpdateException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.javax.ejb.CreateException"
	 * @generated
	 */
	void createEntity(IStockItem stockItem) throws CreateException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.org.cocome.tradingsystem.inventory.data.persistence.UpdateException"
	 * @generated
	 */
	void updateEntity(IStockItem stockItem) throws UpdateException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.javax.ejb.CreateException" enterpriseDataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.ITradingEnterprise"
	 * @generated
	 */
	void createEntity(ITradingEnterprise enterprise) throws CreateException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.javax.ejb.CreateException" productOrderDataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.store.IProductOrder"
	 * @generated
	 */
	void createEntity(IProductOrder productOrder) throws CreateException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.org.cocome.tradingsystem.inventory.data.persistence.UpdateException" enterpriseDataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.ITradingEnterprise"
	 * @generated
	 */
	void updateEntity(ITradingEnterprise enterprise) throws UpdateException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.javax.ejb.CreateException"
	 * @generated
	 */
	void createEntity(IStore store) throws CreateException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.org.cocome.tradingsystem.inventory.data.persistence.UpdateException"
	 * @generated
	 */
	void updateEntity(IStore store) throws UpdateException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.javax.ejb.CreateException" supplierDataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier"
	 * @generated
	 */
	void createEntity(IProductSupplier supplier) throws CreateException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.org.cocome.tradingsystem.inventory.data.persistence.UpdateException" supplierDataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier"
	 * @generated
	 */
	void updateEntity(IProductSupplier supplier) throws UpdateException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.javax.ejb.CreateException"
	 * @generated
	 */
	void createEntity(IProduct product) throws CreateException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.org.cocome.tradingsystem.inventory.data.persistence.UpdateException"
	 * @generated
	 */
	void updateEntity(IProduct product) throws UpdateException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.javax.ejb.CreateException"
	 * @generated
	 */
	void createEntity(Object entity) throws CreateException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.org.cocome.tradingsystem.inventory.data.persistence.UpdateException"
	 * @generated
	 */
	void updateEntity(Object entity) throws UpdateException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.javax.ejb.CreateException" userDataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.IUser"
	 * @generated
	 */
	void createEntity(IUser user) throws CreateException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.org.cocome.tradingsystem.inventory.data.persistence.UpdateException" userDataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.IUser"
	 * @generated
	 */
	void updateEntity(IUser user) throws UpdateException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.javax.ejb.CreateException" customerDataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.ICustomer"
	 * @generated
	 */
	void createEntity(ICustomer customer) throws CreateException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.org.cocome.tradingsystem.inventory.data.persistence.UpdateException" customerDataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.usermanager.ICustomer"
	 * @generated
	 */
	void updateEntity(ICustomer customer) throws UpdateException;

} // CloudPersistenceContext
