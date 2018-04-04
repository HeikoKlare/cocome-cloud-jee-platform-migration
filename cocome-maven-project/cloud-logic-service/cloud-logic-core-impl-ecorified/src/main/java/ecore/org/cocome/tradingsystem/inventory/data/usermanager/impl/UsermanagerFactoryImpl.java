package ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl;

import org.cocome.tradingsystem.inventory.data.usermanager.Customer;
import org.cocome.tradingsystem.inventory.data.usermanager.User;
import org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerDatatypesFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerFactory;
import ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerPackage;

/**
 * An implementation of the model <b>Factory</b>.
 * @generated
 */
public class UsermanagerFactoryImpl extends EFactoryImpl implements UsermanagerFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static UsermanagerFactory init() {
        try {
            UsermanagerFactory theUsermanagerFactory = (UsermanagerFactory)EPackage.Registry.INSTANCE.getEFactory(UsermanagerPackage.eNS_URI);
            if (theUsermanagerFactory != null) {
                return theUsermanagerFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new UsermanagerFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * @generated
     */
    public UsermanagerFactoryImpl() {
        super();
    }

    /**
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
	 * @generated
	 */
	public Customer createCustomer() {
		return new Customer(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public User createUser() {
		return new User(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public UsermanagerDatatypesFactory createUsermanagerDatatypesFactory() {
		return new UsermanagerDatatypesFactory(); // origin code instance
	}	
	
	/**
	 * @generated
	 */
	public UsermanagerPackage getUsermanagerPackage() {
	return (UsermanagerPackage)getEPackage();
	}

    /**
     * @deprecated
     * @generated
     */
    @Deprecated
    public static UsermanagerPackage getPackage() {
        return UsermanagerPackage.eINSTANCE;
    }
    
} //UsermanagerFactoryImpl
