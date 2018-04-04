/**
 */
package ecore.org.cocome.tradingsystem.util.scope.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

import ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry;
import ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistryFactory;
import ecore.org.cocome.tradingsystem.util.scope.CashDeskSessionScopeExtension;
import ecore.org.cocome.tradingsystem.util.scope.ScopeFactoryOld;
import ecore.org.cocome.tradingsystem.util.scope.ScopePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScopeFactoryImplOld extends EFactoryImpl implements ScopeFactoryOld {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScopeFactoryOld init() {
		return new ScopeFactoryImplOld();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeFactoryImplOld() {
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
			case ScopePackage.CASH_DESK_REGISTRY: return createCashDeskRegistry();
			case ScopePackage.CASH_DESK_REGISTRY_FACTORY: return createCashDeskRegistryFactory();
			case ScopePackage.CASH_DESK_SESSION_SCOPE_EXTENSION: return createCashDeskSessionScopeExtension();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CashDeskRegistry createCashDeskRegistry() {
		CashDeskRegistryImpl cashDeskRegistry = new CashDeskRegistryImpl();
		return cashDeskRegistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CashDeskRegistryFactory createCashDeskRegistryFactory() {
		CashDeskRegistryFactoryImpl cashDeskRegistryFactory = new CashDeskRegistryFactoryImpl();
		return cashDeskRegistryFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CashDeskSessionScopeExtension createCashDeskSessionScopeExtension() {
		CashDeskSessionScopeExtensionImpl cashDeskSessionScopeExtension = new CashDeskSessionScopeExtensionImpl();
		return cashDeskSessionScopeExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopePackage getScopePackage() {
		return (ScopePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScopePackage getPackage() {
		return ScopePackage.eINSTANCE;
	}

} //ScopeFactoryImpl
