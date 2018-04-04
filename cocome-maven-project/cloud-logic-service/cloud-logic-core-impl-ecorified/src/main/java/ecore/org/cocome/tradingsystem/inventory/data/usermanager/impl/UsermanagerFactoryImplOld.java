/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

import ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer;
import ecore.org.cocome.tradingsystem.inventory.data.usermanager.User;
import ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerDatatypesFactory;
import ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerFactoryOld;
import ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsermanagerFactoryImplOld extends EFactoryImpl implements UsermanagerFactoryOld {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UsermanagerFactoryOld init() {
		return new UsermanagerFactoryImplOld();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsermanagerFactoryImplOld() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UsermanagerPackage.CUSTOMER: return createCustomer();
			case UsermanagerPackage.USER: return createUser();
			case UsermanagerPackage.USERMANAGER_DATATYPES_FACTORY: return createUsermanagerDatatypesFactory();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsermanagerDatatypesFactory createUsermanagerDatatypesFactory() {
		UsermanagerDatatypesFactoryImpl usermanagerDatatypesFactory = new UsermanagerDatatypesFactoryImpl();
		return usermanagerDatatypesFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsermanagerPackage getUsermanagerPackage() {
		return (UsermanagerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UsermanagerPackage getPackage() {
		return UsermanagerPackage.eINSTANCE;
	}

} //UsermanagerFactoryImpl
