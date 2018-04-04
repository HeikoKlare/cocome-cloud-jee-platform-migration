/**
 */
package ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseFactoryOld
 * @model kind="package"
 * @generated
 */
public interface EnterprisePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "enterprise";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "cloud-logic-core-impl/ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "enterprise";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnterprisePackage eINSTANCE = ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl.init();

	/**
	 * The meta object id for the '<em>IEnterprise Query</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.inventory.data.enterprise.IEnterpriseQuery
	 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl#getIEnterpriseQuery()
	 * @generated
	 */
	int IENTERPRISE_QUERY = 0;

	/**
	 * The meta object id for the '<em>IProduct Supplier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier
	 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl#getIProductSupplier()
	 * @generated
	 */
	int IPRODUCT_SUPPLIER = 1;

	/**
	 * The meta object id for the '<em>ITrading Enterprise</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.inventory.data.enterprise.ITradingEnterprise
	 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl#getITradingEnterprise()
	 * @generated
	 */
	int ITRADING_ENTERPRISE = 2;


	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.inventory.data.enterprise.IEnterpriseQuery <em>IEnterprise Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IEnterprise Query</em>'.
	 * @see org.cocome.tradingsystem.inventory.data.enterprise.IEnterpriseQuery
	 * @model instanceClass="org.cocome.tradingsystem.inventory.data.enterprise.IEnterpriseQuery"
	 * @generated
	 */
	EDataType getIEnterpriseQuery();

	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier <em>IProduct Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IProduct Supplier</em>'.
	 * @see org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier
	 * @model instanceClass="org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier"
	 * @generated
	 */
	EDataType getIProductSupplier();

	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.inventory.data.enterprise.ITradingEnterprise <em>ITrading Enterprise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ITrading Enterprise</em>'.
	 * @see org.cocome.tradingsystem.inventory.data.enterprise.ITradingEnterprise
	 * @model instanceClass="org.cocome.tradingsystem.inventory.data.enterprise.ITradingEnterprise"
	 * @generated
	 */
	EDataType getITradingEnterprise();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnterpriseFactoryOld getEnterpriseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '<em>IEnterprise Query</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.inventory.data.enterprise.IEnterpriseQuery
		 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl#getIEnterpriseQuery()
		 * @generated
		 */
		EDataType IENTERPRISE_QUERY = eINSTANCE.getIEnterpriseQuery();

		/**
		 * The meta object literal for the '<em>IProduct Supplier</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier
		 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl#getIProductSupplier()
		 * @generated
		 */
		EDataType IPRODUCT_SUPPLIER = eINSTANCE.getIProductSupplier();

		/**
		 * The meta object literal for the '<em>ITrading Enterprise</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.inventory.data.enterprise.ITradingEnterprise
		 * @see ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.impl.EnterprisePackageImpl#getITradingEnterprise()
		 * @generated
		 */
		EDataType ITRADING_ENTERPRISE = eINSTANCE.getITradingEnterprise();

	}

} //EnterprisePackage
