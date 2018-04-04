/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.enterprise;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage
 * @generated
 */
public interface EnterpriseFactoryOld extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnterpriseFactoryOld eINSTANCE = ecore.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterpriseFactoryImplOld.init();

	/**
	 * Returns a new object of class '<em>Datatypes Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatypes Factory</em>'.
	 * @generated
	 */
	EnterpriseDatatypesFactory createEnterpriseDatatypesFactory();

	/**
	 * Returns a new object of class '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product</em>'.
	 * @generated
	 */
	Product createProduct();

	/**
	 * Returns a new object of class '<em>Product Supplier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Supplier</em>'.
	 * @generated
	 */
	ProductSupplier createProductSupplier();

	/**
	 * Returns a new object of class '<em>Trading Enterprise</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trading Enterprise</em>'.
	 * @generated
	 */
	TradingEnterprise createTradingEnterprise();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EnterprisePackage getEnterprisePackage();

} //EnterpriseFactory
