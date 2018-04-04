/**
 */
package ecore.org.cocome.tradingsystem.util.scope.context;

import java.lang.annotation.Annotation;

import javax.enterprise.context.spi.Contextual;
import javax.enterprise.context.spi.CreationalContext;

import org.cocome.tradingsystem.util.scope.IContextRegistry;
import org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Session Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#getIsActive <em>Is Active</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#getProvidedScope <em>Provided Scope</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#getContext <em>Context</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#getContextHolder <em>Context Holder</em>}</li>
 * </ul>
 *
 * @see ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage#getNamedSessionContext()
 * @model
 * @generated
 */
public interface NamedSessionContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(ThreadLocal)
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage#getNamedSessionContext_IsActive()
	 * @model dataType="ecore.datatypes.java.lang.ThreadLocal&lt;org.eclipse.emf.ecore.EBooleanObject&gt;"
	 * @generated
	 */
	ThreadLocal<Boolean> getIsActive();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#getIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #getIsActive()
	 * @generated
	 */
	void setIsActive(ThreadLocal<Boolean> value);

	/**
	 * Returns the value of the '<em><b>Provided Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Scope</em>' attribute.
	 * @see #setProvidedScope(ThreadLocal)
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage#getNamedSessionContext_ProvidedScope()
	 * @model dataType="ecore.datatypes.java.lang.ThreadLocal&lt;org.eclipse.emf.ecore.EJavaClass&lt;? extends ecore.datatypes.java.lang.annotation.Annotation&gt;&gt;"
	 * @generated
	 */
	ThreadLocal<Class<? extends Annotation>> getProvidedScope();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#getProvidedScope <em>Provided Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Scope</em>' attribute.
	 * @see #getProvidedScope()
	 * @generated
	 */
	void setProvidedScope(ThreadLocal<Class<? extends Annotation>> value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(ThreadLocal)
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage#getNamedSessionContext_Context()
	 * @model dataType="ecore.datatypes.java.lang.ThreadLocal&lt;ecore.datatypes.org.cocome.tradingsystem.util.scope.IContextRegistry&gt;"
	 * @generated
	 */
	ThreadLocal<IContextRegistry> getContext();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(ThreadLocal<IContextRegistry> value);

	/**
	 * Returns the value of the '<em><b>Context Holder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Holder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Holder</em>' attribute.
	 * @see #setContextHolder(ThreadLocal)
	 * @see ecore.org.cocome.tradingsystem.util.scope.context.ContextPackage#getNamedSessionContext_ContextHolder()
	 * @model dataType="ecore.datatypes.java.lang.ThreadLocal&lt;ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContextHolder&gt;"
	 * @generated
	 */
	ThreadLocal<NamedSessionContextHolder> getContextHolder();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.util.scope.context.NamedSessionContext#getContextHolder <em>Context Holder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Holder</em>' attribute.
	 * @see #getContextHolder()
	 * @generated
	 */
	void setContextHolder(ThreadLocal<NamedSessionContextHolder> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Class<? extends Annotation> getScope();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextualDataType="ecore.datatypes.javax.enterprise.context.spi.Contextual&lt;T&gt;" creationalContextDataType="ecore.datatypes.javax.enterprise.context.spi.CreationalContext&lt;T&gt;"
	 * @generated
	 */
	<T> T get(Contextual<T> contextual, CreationalContext<T> creationalContext);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextualDataType="ecore.datatypes.javax.enterprise.context.spi.Contextual&lt;T&gt;"
	 * @generated
	 */
	<T> T get(Contextual<T> contextual);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isActive();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextDataType="ecore.datatypes.org.cocome.tradingsystem.util.scope.IContextRegistry"
	 * @generated
	 */
	boolean activate(IContextRegistry context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deactivateCurrentContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deleteCurrentContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.org.cocome.tradingsystem.util.scope.IContextRegistry"
	 * @generated
	 */
	IContextRegistry getActiveContext();

} // NamedSessionContext
