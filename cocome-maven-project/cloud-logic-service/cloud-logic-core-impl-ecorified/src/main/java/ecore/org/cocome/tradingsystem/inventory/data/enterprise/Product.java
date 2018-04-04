/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.enterprise;

import javax.enterprise.inject.Instance;

import org.cocome.tradingsystem.inventory.data.enterprise.IEnterpriseQuery;
import org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier;
import org.cocome.tradingsystem.util.scope.IContextRegistry;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product#getId <em>Id</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product#getBarcode <em>Barcode</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product#getPurchasePrice <em>Purchase Price</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product#getName <em>Name</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product#getEnterpriseQuery <em>Enterprise Query</em>}</li>
 *   <li>{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product#getRegistry <em>Registry</em>}</li>
 * </ul>
 *
 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends ecore.org.cocome.tradingsystem.inventory.data.enterprise.IProduct {
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
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage#getProduct_Id()
	 * @model
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Barcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Barcode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Barcode</em>' attribute.
	 * @see #setBarcode(long)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage#getProduct_Barcode()
	 * @model
	 * @generated
	 */
	long getBarcode();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product#getBarcode <em>Barcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Barcode</em>' attribute.
	 * @see #getBarcode()
	 * @generated
	 */
	void setBarcode(long value);

	/**
	 * Returns the value of the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase Price</em>' attribute.
	 * @see #setPurchasePrice(double)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage#getProduct_PurchasePrice()
	 * @model
	 * @generated
	 */
	double getPurchasePrice();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product#getPurchasePrice <em>Purchase Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Price</em>' attribute.
	 * @see #getPurchasePrice()
	 * @generated
	 */
	void setPurchasePrice(double value);

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
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage#getProduct_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' attribute.
	 * @see #setSupplier(IProductSupplier)
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage#getProduct_Supplier()
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier"
	 * @generated
	 */
	IProductSupplier getSupplier();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product#getSupplier <em>Supplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier</em>' attribute.
	 * @see #getSupplier()
	 * @generated
	 */
	void setSupplier(IProductSupplier value);

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
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage#getProduct_EnterpriseQuery()
	 * @model dataType="ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.IEnterpriseQuery"
	 * @generated
	 */
	IEnterpriseQuery getEnterpriseQuery();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product#getEnterpriseQuery <em>Enterprise Query</em>}' attribute.
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
	 * @see ecore.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage#getProduct_Registry()
	 * @model dataType="ecore.datatypes.javax.enterprise.inject.Instance&lt;ecore.datatypes.org.cocome.tradingsystem.util.scope.IContextRegistry&gt;"
	 * @generated
	 */
	Instance<IContextRegistry> getRegistry();

	/**
	 * Sets the value of the '{@link ecore.org.cocome.tradingsystem.inventory.data.enterprise.Product#getRegistry <em>Registry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry</em>' attribute.
	 * @see #getRegistry()
	 * @generated
	 */
	void setRegistry(Instance<IContextRegistry> value);

} // Product
