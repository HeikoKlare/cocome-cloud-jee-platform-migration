/**
 */
package ecore.org.cocome.tradingsystem.util.scope;

import java.util.HashMap;

import org.cocome.tradingsystem.util.scope.RegistryKeys;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cash Desk Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry#getAttributeMap <em>Attribute Map</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry#getContextName <em>Context Name</em>}</li>
 * </ul>
 *
 * @see ecore.org.cocome.tradingsystem.util.scope.ScopePackage#getCashDeskRegistry()
 * @model
 * @generated
 */
public interface CashDeskRegistry extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Map</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Map</em>' attribute.
	 * @see #setAttributeMap(HashMap)
	 * @see ecore.org.cocome.tradingsystem.util.scope.ScopePackage#getCashDeskRegistry_AttributeMap()
	 * @model dataType="ecore.datatypes.java.util.HashMap&lt;ecore.datatypes.org.cocome.tradingsystem.util.scope.RegistryKeys, org.eclipse.emf.ecore.EJavaObject&gt;"
	 * @generated
	 */
	HashMap<RegistryKeys, Object> getAttributeMap();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry#getAttributeMap <em>Attribute Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Map</em>' attribute.
	 * @see #getAttributeMap()
	 * @generated
	 */
	void setAttributeMap(HashMap<RegistryKeys, Object> value);

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
	 * @see ecore.org.cocome.tradingsystem.util.scope.ScopePackage#getCashDeskRegistry_ContextName()
	 * @model
	 * @generated
	 */
	String getContextName();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.util.scope.CashDeskRegistry#getContextName <em>Context Name</em>}' attribute.
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
	 * @model nameDataType="ecore.datatypes.org.cocome.tradingsystem.util.scope.RegistryKeys"
	 * @generated
	 */
	long getLong(RegistryKeys name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="ecore.datatypes.org.cocome.tradingsystem.util.scope.RegistryKeys"
	 * @generated
	 */
	void putLong(RegistryKeys name, long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="ecore.datatypes.org.cocome.tradingsystem.util.scope.RegistryKeys"
	 * @generated
	 */
	String getString(RegistryKeys name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="ecore.datatypes.org.cocome.tradingsystem.util.scope.RegistryKeys"
	 * @generated
	 */
	void putString(RegistryKeys name, String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="ecore.datatypes.org.cocome.tradingsystem.util.scope.RegistryKeys"
	 * @generated
	 */
	Object getObject(RegistryKeys name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="ecore.datatypes.org.cocome.tradingsystem.util.scope.RegistryKeys"
	 * @generated
	 */
	void putObject(RegistryKeys name, Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="ecore.datatypes.org.cocome.tradingsystem.util.scope.RegistryKeys"
	 * @generated
	 */
	boolean hasObject(RegistryKeys name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="ecore.datatypes.org.cocome.tradingsystem.util.scope.RegistryKeys"
	 * @generated
	 */
	boolean hasLong(RegistryKeys name);

} // CashDeskRegistry
