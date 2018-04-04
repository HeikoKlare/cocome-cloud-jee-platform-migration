/**
 */
package ecore.org.cocome.tradingsystem.inventory.data.usermanager;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerFactoryOld
 * @model kind="package"
 * @generated
 */
public interface UsermanagerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "usermanager";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "cloud-logic-core-impl/ecore.org.cocome.tradingsystem.inventory.data.usermanager";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "usermanager";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UsermanagerPackage eINSTANCE = ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl.init();

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.CustomerImpl
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ID = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__FIRST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__LAST_NAME = 2;

	/**
	 * The feature id for the '<em><b>Mail Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__MAIL_ADDRESS = 3;

	/**
	 * The feature id for the '<em><b>Credit Card Info Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CREDIT_CARD_INFO_SET = 4;

	/**
	 * The feature id for the '<em><b>Preferred Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PREFERRED_STORE = 5;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__USER = 6;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Get Credit Card Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___GET_CREDIT_CARD_INFO = 0;

	/**
	 * The operation id for the '<em>Set Credit Card Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___SET_CREDIT_CARD_INFO__SET = 1;

	/**
	 * The operation id for the '<em>Add Credit Card Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___ADD_CREDIT_CARD_INFO__STRING = 2;

	/**
	 * The operation id for the '<em>Remove Credit Card Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___REMOVE_CREDIT_CARD_INFO__STRING = 3;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.UserImpl
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl#getUser()
	 * @generated
	 */
	int USER = 1;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USERNAME = 0;

	/**
	 * The feature id for the '<em><b>Credentials</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CREDENTIALS = 1;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ROLES = 2;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Init User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___INIT_USER = 0;

	/**
	 * The operation id for the '<em>Init User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___INIT_USER__USERTO = 1;

	/**
	 * The operation id for the '<em>Add Credential</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___ADD_CREDENTIAL__ICREDENTIAL = 2;

	/**
	 * The operation id for the '<em>Remove Credential</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___REMOVE_CREDENTIAL__CREDENTIALTYPE = 3;

	/**
	 * The operation id for the '<em>Check Credential</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___CHECK_CREDENTIAL__ICREDENTIAL = 4;

	/**
	 * The operation id for the '<em>Check User Credentials</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___CHECK_USER_CREDENTIALS__IUSER = 5;

	/**
	 * The operation id for the '<em>Has Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___HAS_ROLE__ROLE = 6;

	/**
	 * The operation id for the '<em>Add Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___ADD_ROLE__ROLE = 7;

	/**
	 * The operation id for the '<em>Withdraw Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___WITHDRAW_ROLE__ROLE = 8;

	/**
	 * The operation id for the '<em>Reset Credential</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___RESET_CREDENTIAL__CREDENTIALTYPE = 9;

	/**
	 * The operation id for the '<em>Get Credential</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___GET_CREDENTIAL__CREDENTIALTYPE = 10;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 11;

	/**
	 * The meta object id for the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerDatatypesFactoryImpl <em>Datatypes Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerDatatypesFactoryImpl
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl#getUsermanagerDatatypesFactory()
	 * @generated
	 */
	int USERMANAGER_DATATYPES_FACTORY = 2;

	/**
	 * The number of structural features of the '<em>Datatypes Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERMANAGER_DATATYPES_FACTORY_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get New User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERMANAGER_DATATYPES_FACTORY___GET_NEW_USER = 0;

	/**
	 * The operation id for the '<em>Fill Customer With Store TO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERMANAGER_DATATYPES_FACTORY___FILL_CUSTOMER_WITH_STORE_TO__ICUSTOMER = 1;

	/**
	 * The operation id for the '<em>Fill Credential TO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERMANAGER_DATATYPES_FACTORY___FILL_CREDENTIAL_TO__ICREDENTIAL = 2;

	/**
	 * The operation id for the '<em>Fill User TO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERMANAGER_DATATYPES_FACTORY___FILL_USER_TO__IUSER = 3;

	/**
	 * The operation id for the '<em>Convert To User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERMANAGER_DATATYPES_FACTORY___CONVERT_TO_USER__USERTO = 4;

	/**
	 * The operation id for the '<em>Get New Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERMANAGER_DATATYPES_FACTORY___GET_NEW_CUSTOMER = 5;

	/**
	 * The number of operations of the '<em>Datatypes Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERMANAGER_DATATYPES_FACTORY_OPERATION_COUNT = 6;


	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getId()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Id();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getFirstName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getLastName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_LastName();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getMailAddress <em>Mail Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mail Address</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getMailAddress()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_MailAddress();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getCreditCardInfoSet <em>Credit Card Info Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit Card Info Set</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getCreditCardInfoSet()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CreditCardInfoSet();

	/**
	 * Returns the meta object for the reference '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getPreferredStore <em>Preferred Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Preferred Store</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getPreferredStore()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_PreferredStore();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getUser()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_User();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getCreditCardInfo() <em>Get Credit Card Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Credit Card Info</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#getCreditCardInfo()
	 * @generated
	 */
	EOperation getCustomer__GetCreditCardInfo();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#setCreditCardInfo(java.util.Set) <em>Set Credit Card Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Credit Card Info</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#setCreditCardInfo(java.util.Set)
	 * @generated
	 */
	EOperation getCustomer__SetCreditCardInfo__Set();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#addCreditCardInfo(java.lang.String) <em>Add Credit Card Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Credit Card Info</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#addCreditCardInfo(java.lang.String)
	 * @generated
	 */
	EOperation getCustomer__AddCreditCardInfo__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#removeCreditCardInfo(java.lang.String) <em>Remove Credit Card Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Credit Card Info</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.Customer#removeCreditCardInfo(java.lang.String)
	 * @generated
	 */
	EOperation getCustomer__RemoveCreditCardInfo__String();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#getUsername()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Username();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#getCredentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credentials</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#getCredentials()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Credentials();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roles</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#getRoles()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Roles();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#initUser() <em>Init User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init User</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#initUser()
	 * @generated
	 */
	EOperation getUser__InitUser();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#initUser(org.cocome.tradingsystem.inventory.application.usermanager.UserTO) <em>Init User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init User</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#initUser(org.cocome.tradingsystem.inventory.application.usermanager.UserTO)
	 * @generated
	 */
	EOperation getUser__InitUser__UserTO();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#addCredential(org.cocome.tradingsystem.inventory.application.usermanager.credentials.ICredential) <em>Add Credential</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Credential</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#addCredential(org.cocome.tradingsystem.inventory.application.usermanager.credentials.ICredential)
	 * @generated
	 */
	EOperation getUser__AddCredential__ICredential();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#removeCredential(org.cocome.tradingsystem.inventory.application.usermanager.CredentialType) <em>Remove Credential</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Credential</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#removeCredential(org.cocome.tradingsystem.inventory.application.usermanager.CredentialType)
	 * @generated
	 */
	EOperation getUser__RemoveCredential__CredentialType();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#checkCredential(org.cocome.tradingsystem.inventory.application.usermanager.credentials.ICredential) <em>Check Credential</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Credential</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#checkCredential(org.cocome.tradingsystem.inventory.application.usermanager.credentials.ICredential)
	 * @generated
	 */
	EOperation getUser__CheckCredential__ICredential();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#checkUserCredentials(org.cocome.tradingsystem.inventory.data.usermanager.IUser) <em>Check User Credentials</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check User Credentials</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#checkUserCredentials(org.cocome.tradingsystem.inventory.data.usermanager.IUser)
	 * @generated
	 */
	EOperation getUser__CheckUserCredentials__IUser();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#hasRole(org.cocome.tradingsystem.inventory.application.usermanager.Role) <em>Has Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Role</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#hasRole(org.cocome.tradingsystem.inventory.application.usermanager.Role)
	 * @generated
	 */
	EOperation getUser__HasRole__Role();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#addRole(org.cocome.tradingsystem.inventory.application.usermanager.Role) <em>Add Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Role</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#addRole(org.cocome.tradingsystem.inventory.application.usermanager.Role)
	 * @generated
	 */
	EOperation getUser__AddRole__Role();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#withdrawRole(org.cocome.tradingsystem.inventory.application.usermanager.Role) <em>Withdraw Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Withdraw Role</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#withdrawRole(org.cocome.tradingsystem.inventory.application.usermanager.Role)
	 * @generated
	 */
	EOperation getUser__WithdrawRole__Role();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#resetCredential(org.cocome.tradingsystem.inventory.application.usermanager.CredentialType) <em>Reset Credential</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset Credential</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#resetCredential(org.cocome.tradingsystem.inventory.application.usermanager.CredentialType)
	 * @generated
	 */
	EOperation getUser__ResetCredential__CredentialType();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#getCredential(org.cocome.tradingsystem.inventory.application.usermanager.CredentialType) <em>Get Credential</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Credential</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.User#getCredential(org.cocome.tradingsystem.inventory.application.usermanager.CredentialType)
	 * @generated
	 */
	EOperation getUser__GetCredential__CredentialType();

	/**
	 * Returns the meta object for class '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerDatatypesFactory <em>Datatypes Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatypes Factory</em>'.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerDatatypesFactory
	 * @generated
	 */
	EClass getUsermanagerDatatypesFactory();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerDatatypesFactory#getNewUser() <em>Get New User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get New User</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerDatatypesFactory#getNewUser()
	 * @generated
	 */
	EOperation getUsermanagerDatatypesFactory__GetNewUser();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerDatatypesFactory#fillCustomerWithStoreTO(org.cocome.tradingsystem.inventory.data.usermanager.ICustomer) <em>Fill Customer With Store TO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fill Customer With Store TO</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerDatatypesFactory#fillCustomerWithStoreTO(org.cocome.tradingsystem.inventory.data.usermanager.ICustomer)
	 * @generated
	 */
	EOperation getUsermanagerDatatypesFactory__FillCustomerWithStoreTO__ICustomer();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerDatatypesFactory#fillCredentialTO(org.cocome.tradingsystem.inventory.application.usermanager.credentials.ICredential) <em>Fill Credential TO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fill Credential TO</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerDatatypesFactory#fillCredentialTO(org.cocome.tradingsystem.inventory.application.usermanager.credentials.ICredential)
	 * @generated
	 */
	EOperation getUsermanagerDatatypesFactory__FillCredentialTO__ICredential();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerDatatypesFactory#fillUserTO(org.cocome.tradingsystem.inventory.data.usermanager.IUser) <em>Fill User TO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fill User TO</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerDatatypesFactory#fillUserTO(org.cocome.tradingsystem.inventory.data.usermanager.IUser)
	 * @generated
	 */
	EOperation getUsermanagerDatatypesFactory__FillUserTO__IUser();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerDatatypesFactory#convertToUser(org.cocome.tradingsystem.inventory.application.usermanager.UserTO) <em>Convert To User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To User</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerDatatypesFactory#convertToUser(org.cocome.tradingsystem.inventory.application.usermanager.UserTO)
	 * @generated
	 */
	EOperation getUsermanagerDatatypesFactory__ConvertToUser__UserTO();

	/**
	 * Returns the meta object for the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerDatatypesFactory#getNewCustomer() <em>Get New Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get New Customer</em>' operation.
	 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.UsermanagerDatatypesFactory#getNewCustomer()
	 * @generated
	 */
	EOperation getUsermanagerDatatypesFactory__GetNewCustomer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UsermanagerFactory getUsermanagerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.CustomerImpl
		 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__ID = eINSTANCE.getCustomer_Id();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__FIRST_NAME = eINSTANCE.getCustomer_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__LAST_NAME = eINSTANCE.getCustomer_LastName();

		/**
		 * The meta object literal for the '<em><b>Mail Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__MAIL_ADDRESS = eINSTANCE.getCustomer_MailAddress();

		/**
		 * The meta object literal for the '<em><b>Credit Card Info Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CREDIT_CARD_INFO_SET = eINSTANCE.getCustomer_CreditCardInfoSet();

		/**
		 * The meta object literal for the '<em><b>Preferred Store</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__PREFERRED_STORE = eINSTANCE.getCustomer_PreferredStore();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__USER = eINSTANCE.getCustomer_User();

		/**
		 * The meta object literal for the '<em><b>Get Credit Card Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___GET_CREDIT_CARD_INFO = eINSTANCE.getCustomer__GetCreditCardInfo();

		/**
		 * The meta object literal for the '<em><b>Set Credit Card Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___SET_CREDIT_CARD_INFO__SET = eINSTANCE.getCustomer__SetCreditCardInfo__Set();

		/**
		 * The meta object literal for the '<em><b>Add Credit Card Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___ADD_CREDIT_CARD_INFO__STRING = eINSTANCE.getCustomer__AddCreditCardInfo__String();

		/**
		 * The meta object literal for the '<em><b>Remove Credit Card Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___REMOVE_CREDIT_CARD_INFO__STRING = eINSTANCE.getCustomer__RemoveCreditCardInfo__String();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.UserImpl
		 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USERNAME = eINSTANCE.getUser_Username();

		/**
		 * The meta object literal for the '<em><b>Credentials</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__CREDENTIALS = eINSTANCE.getUser_Credentials();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ROLES = eINSTANCE.getUser_Roles();

		/**
		 * The meta object literal for the '<em><b>Init User</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___INIT_USER = eINSTANCE.getUser__InitUser();

		/**
		 * The meta object literal for the '<em><b>Init User</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___INIT_USER__USERTO = eINSTANCE.getUser__InitUser__UserTO();

		/**
		 * The meta object literal for the '<em><b>Add Credential</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___ADD_CREDENTIAL__ICREDENTIAL = eINSTANCE.getUser__AddCredential__ICredential();

		/**
		 * The meta object literal for the '<em><b>Remove Credential</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___REMOVE_CREDENTIAL__CREDENTIALTYPE = eINSTANCE.getUser__RemoveCredential__CredentialType();

		/**
		 * The meta object literal for the '<em><b>Check Credential</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___CHECK_CREDENTIAL__ICREDENTIAL = eINSTANCE.getUser__CheckCredential__ICredential();

		/**
		 * The meta object literal for the '<em><b>Check User Credentials</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___CHECK_USER_CREDENTIALS__IUSER = eINSTANCE.getUser__CheckUserCredentials__IUser();

		/**
		 * The meta object literal for the '<em><b>Has Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___HAS_ROLE__ROLE = eINSTANCE.getUser__HasRole__Role();

		/**
		 * The meta object literal for the '<em><b>Add Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___ADD_ROLE__ROLE = eINSTANCE.getUser__AddRole__Role();

		/**
		 * The meta object literal for the '<em><b>Withdraw Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___WITHDRAW_ROLE__ROLE = eINSTANCE.getUser__WithdrawRole__Role();

		/**
		 * The meta object literal for the '<em><b>Reset Credential</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___RESET_CREDENTIAL__CREDENTIALTYPE = eINSTANCE.getUser__ResetCredential__CredentialType();

		/**
		 * The meta object literal for the '<em><b>Get Credential</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___GET_CREDENTIAL__CREDENTIALTYPE = eINSTANCE.getUser__GetCredential__CredentialType();

		/**
		 * The meta object literal for the '{@link ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerDatatypesFactoryImpl <em>Datatypes Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerDatatypesFactoryImpl
		 * @see ecore.org.cocome.tradingsystem.inventory.data.usermanager.impl.UsermanagerPackageImpl#getUsermanagerDatatypesFactory()
		 * @generated
		 */
		EClass USERMANAGER_DATATYPES_FACTORY = eINSTANCE.getUsermanagerDatatypesFactory();

		/**
		 * The meta object literal for the '<em><b>Get New User</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USERMANAGER_DATATYPES_FACTORY___GET_NEW_USER = eINSTANCE.getUsermanagerDatatypesFactory__GetNewUser();

		/**
		 * The meta object literal for the '<em><b>Fill Customer With Store TO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USERMANAGER_DATATYPES_FACTORY___FILL_CUSTOMER_WITH_STORE_TO__ICUSTOMER = eINSTANCE.getUsermanagerDatatypesFactory__FillCustomerWithStoreTO__ICustomer();

		/**
		 * The meta object literal for the '<em><b>Fill Credential TO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USERMANAGER_DATATYPES_FACTORY___FILL_CREDENTIAL_TO__ICREDENTIAL = eINSTANCE.getUsermanagerDatatypesFactory__FillCredentialTO__ICredential();

		/**
		 * The meta object literal for the '<em><b>Fill User TO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USERMANAGER_DATATYPES_FACTORY___FILL_USER_TO__IUSER = eINSTANCE.getUsermanagerDatatypesFactory__FillUserTO__IUser();

		/**
		 * The meta object literal for the '<em><b>Convert To User</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USERMANAGER_DATATYPES_FACTORY___CONVERT_TO_USER__USERTO = eINSTANCE.getUsermanagerDatatypesFactory__ConvertToUser__UserTO();

		/**
		 * The meta object literal for the '<em><b>Get New Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USERMANAGER_DATATYPES_FACTORY___GET_NEW_CUSTOMER = eINSTANCE.getUsermanagerDatatypesFactory__GetNewCustomer();

	}

} //UsermanagerPackage
