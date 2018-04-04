/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.enterprise;

import java.util.Collection;

import org.cocome.tradingsystem.inventory.data.enterprise.IEnterpriseQuery;
import org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier;
import org.cocome.tradingsystem.inventory.data.store.IStore;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trading Enterprise</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise#getId <em>Id</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise#getName <em>Name</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise#getSuppliers <em>Suppliers</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise#getStores <em>Stores</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise#getEnterpriseQuery <em>Enterprise Query</em>}</li>
 * </ul>
 *
 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage#getTradingEnterprise()
 * @model
 * @generated
 */
public interface TradingEnterprise extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage#getTradingEnterprise_Id()
	 * @model
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage#getTradingEnterprise_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Suppliers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suppliers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suppliers</em>' attribute.
	 * @see #setSuppliers(Collection)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage#getTradingEnterprise_Suppliers()
	 * @model dataType="ecore.datatypes.java.util.Collection&lt;ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier&gt;"
	 * @generated
	 */
	Collection<IProductSupplier> getSuppliers();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise#getSuppliers <em>Suppliers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suppliers</em>' attribute.
	 * @see #getSuppliers()
	 * @generated
	 */
	void setSuppliers(Collection<IProductSupplier> value);

	/**
	 * Returns the value of the '<em><b>Stores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stores</em>' attribute.
	 * @see #setStores(Collection)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage#getTradingEnterprise_Stores()
	 * @model dataType="ecore.datatypes.java.util.Collection&lt;ecore.org.cocome.tradingsystem.inventory.data.store.IStore&gt;"
	 * @generated
	 */
	Collection<IStore> getStores();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise#getStores <em>Stores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stores</em>' attribute.
	 * @see #getStores()
	 * @generated
	 */
	void setStores(Collection<IStore> value);

	/**
	 * Returns the value of the '<em><b>Enterprise Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enterprise Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enterprise Query</em>' attribute.
	 * @see #setEnterpriseQuery(IEnterpriseQuery)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage#getTradingEnterprise_EnterpriseQuery()
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.IEnterpriseQuery"
	 * @generated
	 */
	IEnterpriseQuery getEnterpriseQuery();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.TradingEnterprise#getEnterpriseQuery <em>Enterprise Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enterprise Query</em>' attribute.
	 * @see #getEnterpriseQuery()
	 * @generated
	 */
	void setEnterpriseQuery(IEnterpriseQuery value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initTradingEnterprise();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String toString();

} // TradingEnterprise
