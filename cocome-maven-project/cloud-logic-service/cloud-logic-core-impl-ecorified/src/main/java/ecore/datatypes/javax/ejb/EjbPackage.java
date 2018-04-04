/**
 */
package ecore.datatypes.javax.ejb;

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
 * @see ecore.datatypes.javax.ejb.EjbFactoryOld
 * @model kind="package"
 * @generated
 */
public interface EjbPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ejb";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "cloud-logic-core-impl/ecore.datatypes.javax.ejb";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ejb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EjbPackage eINSTANCE = ecore.datatypes.javax.ejb.impl.EjbPackageImpl.init();

	/**
	 * The meta object id for the '<em>Create Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.ejb.CreateException
	 * @see ecore.datatypes.javax.ejb.impl.EjbPackageImpl#getCreateException()
	 * @generated
	 */
	int CREATE_EXCEPTION = 0;


	/**
	 * Returns the meta object for data type '{@link javax.ejb.CreateException <em>Create Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Create Exception</em>'.
	 * @see javax.ejb.CreateException
	 * @model instanceClass="javax.ejb.CreateException"
	 * @generated
	 */
	EDataType getCreateException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EjbFactoryOld getEjbFactory();

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
		 * The meta object literal for the '<em>Create Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.ejb.CreateException
		 * @see ecore.datatypes.javax.ejb.impl.EjbPackageImpl#getCreateException()
		 * @generated
		 */
		EDataType CREATE_EXCEPTION = eINSTANCE.getCreateException();

	}

} //EjbPackage
