/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.store;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ecore.org.cocome.tradingsystem.inventory.data.store.StorePackage
 * @generated
 */
public interface StoreFactoryOld extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StoreFactoryOld eINSTANCE = ecore.org.cocome.tradingsystem.inventory.data.store.impl.StoreFactoryImplOld.init();

	/**
	 * Returns a new object of class '<em>Enterprise Store Query Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enterprise Store Query Provider</em>'.
	 * @generated
	 */
	EnterpriseStoreQueryProvider createEnterpriseStoreQueryProvider();

	/**
	 * Returns a new object of class '<em>Order Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order Entry</em>'.
	 * @generated
	 */
	OrderEntry createOrderEntry();

	/**
	 * Returns a new object of class '<em>Product Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Order</em>'.
	 * @generated
	 */
	ProductOrder createProductOrder();

	/**
	 * Returns a new object of class '<em>Stock Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stock Item</em>'.
	 * @generated
	 */
	StockItem createStockItem();

	/**
	 * Returns a new object of class '<em>Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Store</em>'.
	 * @generated
	 */
	Store createStore();

	/**
	 * Returns a new object of class '<em>Datatypes Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatypes Factory</em>'.
	 * @generated
	 */
	StoreDatatypesFactory createStoreDatatypesFactory();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StorePackage getStorePackage();

} //StoreFactory
