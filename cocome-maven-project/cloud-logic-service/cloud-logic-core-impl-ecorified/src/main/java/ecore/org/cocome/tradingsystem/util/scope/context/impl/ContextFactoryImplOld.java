/**
 */
package ecore.org.cocome.tradingsystem.util.scope.context.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

import ecore.org.cocome.tradingsystem.util.scope.context.ContextFactoryOld;
import ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage;
import ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext;
import ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContextFactoryImplOld extends EFactoryImpl implements ContextFactoryOld {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContextFactoryOld init() {
		return new ContextFactoryImplOld();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextFactoryImplOld() {
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
			case ContextPackage.NAMED_SESSION_CONTEXT: return createNamedSessionContext();
			case ContextPackage.NAMED_SESSION_CONTEXT_HOLDER: return createNamedSessionContextHolder();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedSessionContext createNamedSessionContext() {
		NamedSessionContextImpl namedSessionContext = new NamedSessionContextImpl();
		return namedSessionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedSessionContextHolder createNamedSessionContextHolder() {
		NamedSessionContextHolderImpl namedSessionContextHolder = new NamedSessionContextHolderImpl();
		return namedSessionContextHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextPackage getContextPackage() {
		return (ContextPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContextPackage getPackage() {
		return ContextPackage.eINSTANCE;
	}

} //ContextFactoryImpl
