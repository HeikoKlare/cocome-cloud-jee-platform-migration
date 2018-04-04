/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.enterprise;

import java.util.Collection;

import javax.enterprise.inject.Instance;

import org.cocome.tradingsystem.inventory.data.enterprise.IEnterpriseQuery;
import org.cocome.tradingsystem.inventory.data.enterprise.IProduct;
import org.cocome.tradingsystem.util.scope.IContextRegistry;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Supplier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier#getId <em>Id</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier#getName <em>Name</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier#getProducts <em>Products</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier#getEnterpriseQuery <em>Enterprise Query</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier#getRegistry <em>Registry</em>}</li>
 * </ul>
 *
 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage#getProductSupplier()
 * @model
 * @generated
 */
public interface ProductSupplier extends EObject {
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
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage#getProductSupplier_Id()
	 * @model
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier#getId <em>Id</em>}' attribute.
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
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage#getProductSupplier_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Products</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Products</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' attribute.
	 * @see #setProducts(Collection)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage#getProductSupplier_Products()
	 * @model dataType="ecore.datatypes.java.util.Collection&lt;ecore.org.cocome.tradingsystem.inventory.data.enterprise.IProduct&gt;"
	 * @generated
	 */
	Collection<IProduct> getProducts();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier#getProducts <em>Products</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Products</em>' attribute.
	 * @see #getProducts()
	 * @generated
	 */
	void setProducts(Collection<IProduct> value);

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
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage#getProductSupplier_EnterpriseQuery()
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.IEnterpriseQuery"
	 * @generated
	 */
	IEnterpriseQuery getEnterpriseQuery();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier#getEnterpriseQuery <em>Enterprise Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enterprise Query</em>' attribute.
	 * @see #getEnterpriseQuery()
	 * @generated
	 */
	void setEnterpriseQuery(IEnterpriseQuery value);

	/**
	 * Returns the value of the '<em><b>Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry</em>' attribute.
	 * @see #setRegistry(Instance)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage#getProductSupplier_Registry()
	 * @model dataType="ecore.datatypes.javax.enterprise.inject.Instance&lt;ecore.datatypes.org.cocome.tradingsystem.util.scope.IContextRegistry&gt;"
	 * @generated
	 */
	Instance<IContextRegistry> getRegistry();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.ProductSupplier#getRegistry <em>Registry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry</em>' attribute.
	 * @see #getRegistry()
	 * @generated
	 */
	void setRegistry(Instance<IContextRegistry> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initProductSupplier();

} // ProductSupplier
