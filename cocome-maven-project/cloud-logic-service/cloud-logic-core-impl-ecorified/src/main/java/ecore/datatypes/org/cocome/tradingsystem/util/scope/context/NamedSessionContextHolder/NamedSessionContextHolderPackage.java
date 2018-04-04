/**
 */
package ecore.datatypes.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder;

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
 * @see ecore.datatypes.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder.NamedSessionContextHolderFactoryOld
 * @model kind="package"
 * @generated
 */
public interface NamedSessionContextHolderPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "NamedSessionContextHolder";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "cloud-logic-core-impl/ecore.datatypes.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "NamedSessionContextHolder";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NamedSessionContextHolderPackage eINSTANCE = ecore.datatypes.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder.impl.NamedSessionContextHolderPackageImpl.init();

	/**
	 * The meta object id for the '<em>Named Session Instance</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder.NamedSessionInstance
	 * @see ecore.datatypes.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder.impl.NamedSessionContextHolderPackageImpl#getNamedSessionInstance()
	 * @generated
	 */
	int NAMED_SESSION_INSTANCE = 0;


	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder.NamedSessionInstance <em>Named Session Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Named Session Instance</em>'.
	 * @see org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder.NamedSessionInstance
	 * @model instanceClass="org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder.NamedSessionInstance" typeParameters="T"
	 * @generated
	 */
	EDataType getNamedSessionInstance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NamedSessionContextHolderFactoryOld getNamedSessionContextHolderFactory();

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
		 * The meta object literal for the '<em>Named Session Instance</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder.NamedSessionInstance
		 * @see ecore.datatypes.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder.impl.NamedSessionContextHolderPackageImpl#getNamedSessionInstance()
		 * @generated
		 */
		EDataType NAMED_SESSION_INSTANCE = eINSTANCE.getNamedSessionInstance();

	}

} //NamedSessionContextHolderPackage
