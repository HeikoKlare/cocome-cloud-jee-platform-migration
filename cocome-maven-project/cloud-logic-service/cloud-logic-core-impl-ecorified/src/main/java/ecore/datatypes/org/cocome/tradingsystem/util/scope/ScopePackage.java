/**
 */
package ecore.datatypes.org.cocome.tradingsystem.util.scope;

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
 * @see ecore.datatypes.org.cocome.tradingsystem.util.scope.ScopeFactoryOld
 * @model kind="package"
 * @generated
 */
public interface ScopePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scope";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "cloud-logic-core-impl/ecore.datatypes.org.cocome.tradingsystem.util.scope";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "scope";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScopePackage eINSTANCE = ecore.datatypes.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl.init();

	/**
	 * The meta object id for the '<em>IContext Registry</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.util.scope.IContextRegistry
	 * @see ecore.datatypes.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl#getIContextRegistry()
	 * @generated
	 */
	int ICONTEXT_REGISTRY = 0;

	/**
	 * The meta object id for the '<em>Registry Keys</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.util.scope.RegistryKeys
	 * @see ecore.datatypes.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl#getRegistryKeys()
	 * @generated
	 */
	int REGISTRY_KEYS = 1;


	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.util.scope.IContextRegistry <em>IContext Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IContext Registry</em>'.
	 * @see org.cocome.tradingsystem.util.scope.IContextRegistry
	 * @model instanceClass="org.cocome.tradingsystem.util.scope.IContextRegistry"
	 * @generated
	 */
	EDataType getIContextRegistry();

	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.util.scope.RegistryKeys <em>Registry Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Registry Keys</em>'.
	 * @see org.cocome.tradingsystem.util.scope.RegistryKeys
	 * @model instanceClass="org.cocome.tradingsystem.util.scope.RegistryKeys"
	 * @generated
	 */
	EDataType getRegistryKeys();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScopeFactoryOld getScopeFactory();

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
		 * The meta object literal for the '<em>IContext Registry</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.util.scope.IContextRegistry
		 * @see ecore.datatypes.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl#getIContextRegistry()
		 * @generated
		 */
		EDataType ICONTEXT_REGISTRY = eINSTANCE.getIContextRegistry();

		/**
		 * The meta object literal for the '<em>Registry Keys</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.util.scope.RegistryKeys
		 * @see ecore.datatypes.org.cocome.tradingsystem.util.scope.impl.ScopePackageImpl#getRegistryKeys()
		 * @generated
		 */
		EDataType REGISTRY_KEYS = eINSTANCE.getRegistryKeys();

	}

} //ScopePackage
