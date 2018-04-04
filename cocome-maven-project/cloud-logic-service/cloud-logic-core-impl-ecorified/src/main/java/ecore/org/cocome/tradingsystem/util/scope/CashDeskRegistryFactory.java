/**
 */
package ecore.org.cocome.tradingsystem.util.scope;

import javax.enterprise.context.ContextNotActiveException;
import javax.enterprise.inject.spi.BeanManager;

import org.cocome.tradingsystem.util.scope.IContextRegistry;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cash Desk Registry Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistryFactory#getManager <em>Manager</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistryFactory#getStoreContext <em>Store Context</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistryFactory#getEnterpriseContext <em>Enterprise Context</em>}</li>
 * </ul>
 *
 * @see ecore.org.cocome.tradingsystem.util.scope.ScopePackage#getCashDeskRegistryFactory()
 * @model
 * @generated
 */
public interface CashDeskRegistryFactory extends EObject {
	/**
	 * Returns the value of the '<em><b>Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' attribute.
	 * @see #setManager(BeanManager)
	 * @see ecore.org.cocome.tradingsystem.util.scope.ScopePackage#getCashDeskRegistryFactory_Manager()
	 * @model dataType="ecore.datatypes.javax.enterprise.inject.spi.BeanManager"
	 * @generated
	 */
	BeanManager getManager();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistryFactory#getManager <em>Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' attribute.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(BeanManager value);

	/**
	 * Returns the value of the '<em><b>Store Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Context</em>' attribute.
	 * @see #setStoreContext(IContextRegistry)
	 * @see ecore.org.cocome.tradingsystem.util.scope.ScopePackage#getCashDeskRegistryFactory_StoreContext()
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.util.scope.IContextRegistry"
	 * @generated
	 */
	IContextRegistry getStoreContext();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistryFactory#getStoreContext <em>Store Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store Context</em>' attribute.
	 * @see #getStoreContext()
	 * @generated
	 */
	void setStoreContext(IContextRegistry value);

	/**
	 * Returns the value of the '<em><b>Enterprise Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enterprise Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enterprise Context</em>' attribute.
	 * @see #setEnterpriseContext(IContextRegistry)
	 * @see ecore.org.cocome.tradingsystem.util.scope.ScopePackage#getCashDeskRegistryFactory_EnterpriseContext()
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.util.scope.IContextRegistry"
	 * @generated
	 */
	IContextRegistry getEnterpriseContext();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistryFactory#getEnterpriseContext <em>Enterprise Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enterprise Context</em>' attribute.
	 * @see #getEnterpriseContext()
	 * @generated
	 */
	void setEnterpriseContext(IContextRegistry value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.org.cocome.tradingsystem.util.scope.IContextRegistry" exceptions="ecore.datatypes.javax.enterprise.context.ContextNotActiveException"
	 * @generated
	 */
	IContextRegistry getCashDeskContextRegistry() throws ContextNotActiveException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.org.cocome.tradingsystem.util.scope.IContextRegistry" exceptions="ecore.datatypes.javax.enterprise.context.ContextNotActiveException"
	 * @generated
	 */
	IContextRegistry getStoreContextRegistry() throws ContextNotActiveException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.org.cocome.tradingsystem.util.scope.IContextRegistry" exceptions="ecore.datatypes.javax.enterprise.context.ContextNotActiveException"
	 * @generated
	 */
	IContextRegistry getEnterpriseContextRegistry() throws ContextNotActiveException;

} // CashDeskRegistryFactory
