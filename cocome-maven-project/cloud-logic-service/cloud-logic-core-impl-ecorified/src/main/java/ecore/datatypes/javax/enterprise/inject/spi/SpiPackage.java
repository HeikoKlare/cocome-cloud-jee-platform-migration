/**
 */
package ecore.datatypes.javax.enterprise.inject.spi;

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
 * @see ecore.datatypes.javax.enterprise.inject.spi.SpiFactoryOld
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
	String eNS_URI = "cloud-logic-core-impl/ecore.datatypes.javax.enterprise.inject.spi";

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
	SpiPackage eINSTANCE = ecore.datatypes.javax.enterprise.inject.spi.impl.SpiPackageImpl.init();

	/**
	 * The meta object id for the '<em>After Bean Discovery</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.enterprise.inject.spi.AfterBeanDiscovery
	 * @see ecore.datatypes.javax.enterprise.inject.spi.impl.SpiPackageImpl#getAfterBeanDiscovery()
	 * @generated
	 */
	int AFTER_BEAN_DISCOVERY = 0;

	/**
	 * The meta object id for the '<em>Bean Manager</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.enterprise.inject.spi.BeanManager
	 * @see ecore.datatypes.javax.enterprise.inject.spi.impl.SpiPackageImpl#getBeanManager()
	 * @generated
	 */
	int BEAN_MANAGER = 1;

	/**
	 * The meta object id for the '<em>Before Bean Discovery</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.enterprise.inject.spi.BeforeBeanDiscovery
	 * @see ecore.datatypes.javax.enterprise.inject.spi.impl.SpiPackageImpl#getBeforeBeanDiscovery()
	 * @generated
	 */
	int BEFORE_BEAN_DISCOVERY = 2;


	/**
	 * Returns the meta object for data type '{@link javax.enterprise.inject.spi.AfterBeanDiscovery <em>After Bean Discovery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>After Bean Discovery</em>'.
	 * @see javax.enterprise.inject.spi.AfterBeanDiscovery
	 * @model instanceClass="javax.enterprise.inject.spi.AfterBeanDiscovery"
	 * @generated
	 */
	EDataType getAfterBeanDiscovery();

	/**
	 * Returns the meta object for data type '{@link javax.enterprise.inject.spi.BeanManager <em>Bean Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bean Manager</em>'.
	 * @see javax.enterprise.inject.spi.BeanManager
	 * @model instanceClass="javax.enterprise.inject.spi.BeanManager"
	 * @generated
	 */
	EDataType getBeanManager();

	/**
	 * Returns the meta object for data type '{@link javax.enterprise.inject.spi.BeforeBeanDiscovery <em>Before Bean Discovery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Before Bean Discovery</em>'.
	 * @see javax.enterprise.inject.spi.BeforeBeanDiscovery
	 * @model instanceClass="javax.enterprise.inject.spi.BeforeBeanDiscovery"
	 * @generated
	 */
	EDataType getBeforeBeanDiscovery();

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
		 * The meta object literal for the '<em>After Bean Discovery</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.enterprise.inject.spi.AfterBeanDiscovery
		 * @see ecore.datatypes.javax.enterprise.inject.spi.impl.SpiPackageImpl#getAfterBeanDiscovery()
		 * @generated
		 */
		EDataType AFTER_BEAN_DISCOVERY = eINSTANCE.getAfterBeanDiscovery();

		/**
		 * The meta object literal for the '<em>Bean Manager</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.enterprise.inject.spi.BeanManager
		 * @see ecore.datatypes.javax.enterprise.inject.spi.impl.SpiPackageImpl#getBeanManager()
		 * @generated
		 */
		EDataType BEAN_MANAGER = eINSTANCE.getBeanManager();

		/**
		 * The meta object literal for the '<em>Before Bean Discovery</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.enterprise.inject.spi.BeforeBeanDiscovery
		 * @see ecore.datatypes.javax.enterprise.inject.spi.impl.SpiPackageImpl#getBeforeBeanDiscovery()
		 * @generated
		 */
		EDataType BEFORE_BEAN_DISCOVERY = eINSTANCE.getBeforeBeanDiscovery();

	}

} //SpiPackage
