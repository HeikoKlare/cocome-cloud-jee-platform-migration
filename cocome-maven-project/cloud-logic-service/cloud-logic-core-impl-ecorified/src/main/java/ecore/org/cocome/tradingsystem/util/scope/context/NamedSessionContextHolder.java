/**
 */
package ecore.org.cocome.tradingsystem.util.scope.context;

import java.util.Map;

import org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder.NamedSessionInstance;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Session Context Holder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder#getBeans <em>Beans</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder#getContextName <em>Context Name</em>}</li>
 * </ul>
 *
 * @see ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage#getNamedSessionContextHolder()
 * @model
 * @generated
 */
public interface NamedSessionContextHolder extends EObject {
	/**
	 * Returns the value of the '<em><b>Beans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beans</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beans</em>' attribute.
	 * @see #setBeans(Map)
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage#getNamedSessionContextHolder_Beans()
	 * @model dataType="ecore.datatypes.java.util.Map&lt;org.eclipse.emf.ecore.EJavaClass&lt;?&gt;, ecore.datatypes.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder.NamedSessionInstance&lt;?&gt;&gt;"
	 * @generated
	 */
	Map<Class<?>, NamedSessionInstance<?>> getBeans();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder#getBeans <em>Beans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beans</em>' attribute.
	 * @see #getBeans()
	 * @generated
	 */
	void setBeans(Map<Class<?>, NamedSessionInstance<?>> value);

	/**
	 * Returns the value of the '<em><b>Context Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Name</em>' attribute.
	 * @see #setContextName(String)
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage#getNamedSessionContextHolder_ContextName()
	 * @model
	 * @generated
	 */
	String getContextName();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder#getContextName <em>Context Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Name</em>' attribute.
	 * @see #getContextName()
	 * @generated
	 */
	void setContextName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder.NamedSessionInstance&lt;T&gt;"
	 * @generated
	 */
	<T> NamedSessionInstance<T> getBean(Class<T> type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cashDeskInstanceDataType="ecore.datatypes.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder.NamedSessionInstance&lt;T&gt;"
	 * @generated
	 */
	<T> void putBean(NamedSessionInstance<T> cashDeskInstance);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cashDeskInstanceDataType="ecore.datatypes.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder.NamedSessionInstance&lt;T&gt;"
	 * @generated
	 */
	<T> void destroyBean(NamedSessionInstance<T> cashDeskInstance);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void destroyAllBeans();

} // NamedSessionContextHolder
