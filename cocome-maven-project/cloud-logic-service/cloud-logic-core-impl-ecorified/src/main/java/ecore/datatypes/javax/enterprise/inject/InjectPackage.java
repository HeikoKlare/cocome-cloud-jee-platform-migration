/**
 */
package ecore.datatypes.javax.enterprise.inject;

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
 * @see ecore.datatypes.javax.enterprise.inject.InjectFactoryOld
 * @model kind="package"
 * @generated
 */
public interface InjectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "inject";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "cloud-logic-core-impl/ecore.datatypes.javax.enterprise.inject";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "inject";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InjectPackage eINSTANCE = ecore.datatypes.javax.enterprise.inject.impl.InjectPackageImpl.init();

	/**
	 * The meta object id for the '<em>Instance</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.enterprise.inject.Instance
	 * @see ecore.datatypes.javax.enterprise.inject.impl.InjectPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 0;


	/**
	 * Returns the meta object for data type '{@link javax.enterprise.inject.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Instance</em>'.
	 * @see javax.enterprise.inject.Instance
	 * @model instanceClass="javax.enterprise.inject.Instance" typeParameters="T"
	 * @generated
	 */
	EDataType getInstance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InjectFactoryOld getInjectFactory();

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
		 * The meta object literal for the '<em>Instance</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.enterprise.inject.Instance
		 * @see ecore.datatypes.javax.enterprise.inject.impl.InjectPackageImpl#getInstance()
		 * @generated
		 */
		EDataType INSTANCE = eINSTANCE.getInstance();

	}

} //InjectPackage
