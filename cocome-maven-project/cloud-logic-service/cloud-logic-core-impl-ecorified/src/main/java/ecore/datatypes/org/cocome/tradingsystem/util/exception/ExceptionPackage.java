/**
 */
package ecore.datatypes.org.cocome.tradingsystem.util.exception;

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
 * @see ecore.datatypes.org.cocome.tradingsystem.util.exception.ExceptionFactoryOld
 * @model kind="package"
 * @generated
 */
public interface ExceptionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "exception";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "cloud-logic-core-impl/ecore.datatypes.org.cocome.tradingsystem.util.exception";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "exception";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExceptionPackage eINSTANCE = ecore.datatypes.org.cocome.tradingsystem.util.exception.impl.ExceptionPackageImpl.init();

	/**
	 * The meta object id for the '<em>Not In Database Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.cocome.tradingsystem.util.exception.NotInDatabaseException
	 * @see ecore.datatypes.org.cocome.tradingsystem.util.exception.impl.ExceptionPackageImpl#getNotInDatabaseException()
	 * @generated
	 */
	int NOT_IN_DATABASE_EXCEPTION = 0;


	/**
	 * Returns the meta object for data type '{@link org.cocome.tradingsystem.util.exception.NotInDatabaseException <em>Not In Database Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Not In Database Exception</em>'.
	 * @see org.cocome.tradingsystem.util.exception.NotInDatabaseException
	 * @model instanceClass="org.cocome.tradingsystem.util.exception.NotInDatabaseException"
	 * @generated
	 */
	EDataType getNotInDatabaseException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExceptionFactoryOld getExceptionFactory();

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
		 * The meta object literal for the '<em>Not In Database Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.cocome.tradingsystem.util.exception.NotInDatabaseException
		 * @see ecore.datatypes.org.cocome.tradingsystem.util.exception.impl.ExceptionPackageImpl#getNotInDatabaseException()
		 * @generated
		 */
		EDataType NOT_IN_DATABASE_EXCEPTION = eINSTANCE.getNotInDatabaseException();

	}

} //ExceptionPackage
