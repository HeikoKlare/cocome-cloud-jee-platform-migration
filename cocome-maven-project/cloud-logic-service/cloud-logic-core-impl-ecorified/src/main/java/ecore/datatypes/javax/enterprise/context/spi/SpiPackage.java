/**
 */
package ecore.datatypes.javax.enterprise.context.spi;

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
 * @see ecore.datatypes.javax.enterprise.context.spi.SpiFactoryOld
 * @model kind="package"
 * @generated
 */
public interface SpiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "cloud-logic-core-impl/ecore.datatypes.javax.enterprise.context.spi";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpiPackage eINSTANCE = ecore.datatypes.javax.enterprise.context.spi.impl.SpiPackageImpl.init();

	/**
	 * The meta object id for the '<em>Contextual</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.enterprise.context.spi.Contextual
	 * @see ecore.datatypes.javax.enterprise.context.spi.impl.SpiPackageImpl#getContextual()
	 * @generated
	 */
	int CONTEXTUAL = 0;

	/**
	 * The meta object id for the '<em>Creational Context</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.enterprise.context.spi.CreationalContext
	 * @see ecore.datatypes.javax.enterprise.context.spi.impl.SpiPackageImpl#getCreationalContext()
	 * @generated
	 */
	int CREATIONAL_CONTEXT = 1;


	/**
	 * Returns the meta object for data type '{@link javax.enterprise.context.spi.Contextual <em>Contextual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Contextual</em>'.
	 * @see javax.enterprise.context.spi.Contextual
	 * @model instanceClass="javax.enterprise.context.spi.Contextual" typeParameters="T"
	 * @generated
	 */
	EDataType getContextual();

	/**
	 * Returns the meta object for data type '{@link javax.enterprise.context.spi.CreationalContext <em>Creational Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Creational Context</em>'.
	 * @see javax.enterprise.context.spi.CreationalContext
	 * @model instanceClass="javax.enterprise.context.spi.CreationalContext" typeParameters="T"
	 * @generated
	 */
	EDataType getCreationalContext();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpiFactoryOld getSpiFactory();

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
		 * The meta object literal for the '<em>Contextual</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.enterprise.context.spi.Contextual
		 * @see ecore.datatypes.javax.enterprise.context.spi.impl.SpiPackageImpl#getContextual()
		 * @generated
		 */
		EDataType CONTEXTUAL = eINSTANCE.getContextual();

		/**
		 * The meta object literal for the '<em>Creational Context</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.enterprise.context.spi.CreationalContext
		 * @see ecore.datatypes.javax.enterprise.context.spi.impl.SpiPackageImpl#getCreationalContext()
		 * @generated
		 */
		EDataType CREATIONAL_CONTEXT = eINSTANCE.getCreationalContext();

	}

} //SpiPackage
