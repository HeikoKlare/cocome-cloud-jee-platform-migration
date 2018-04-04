/**
 */
package ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.impl;

import org.cocome.tradingsystem.inventory.data.enterprise.IEnterpriseQuery;
import org.cocome.tradingsystem.inventory.data.enterprise.IProductSupplier;
import org.cocome.tradingsystem.inventory.data.enterprise.ITradingEnterprise;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

import ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.EnterpriseFactoryOld;
import ecore.datatypes.org.cocome.tradingsystem.inventory.data.enterprise.EnterprisePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnterpriseFactoryImplOld extends EFactoryImpl implements EnterpriseFactoryOld {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnterpriseFactoryOld init() {
		return new EnterpriseFactoryImplOld();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnterpriseFactoryImplOld() {
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
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EnterprisePackage.IENTERPRISE_QUERY:
				return createIEnterpriseQueryFromString(eDataType, initialValue);
			case EnterprisePackage.IPRODUCT_SUPPLIER:
				return createIProductSupplierFromString(eDataType, initialValue);
			case EnterprisePackage.ITRADING_ENTERPRISE:
				return createITradingEnterpriseFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EnterprisePackage.IENTERPRISE_QUERY:
				return convertIEnterpriseQueryToString(eDataType, instanceValue);
			case EnterprisePackage.IPRODUCT_SUPPLIER:
				return convertIProductSupplierToString(eDataType, instanceValue);
			case EnterprisePackage.ITRADING_ENTERPRISE:
				return convertITradingEnterpriseToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEnterpriseQuery createIEnterpriseQueryFromString(EDataType eDataType, String initialValue) {
		return (IEnterpriseQuery)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIEnterpriseQueryToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProductSupplier createIProductSupplierFromString(EDataType eDataType, String initialValue) {
		return (IProductSupplier)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIProductSupplierToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITradingEnterprise createITradingEnterpriseFromString(EDataType eDataType, String initialValue) {
		return (ITradingEnterprise)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertITradingEnterpriseToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnterprisePackage getEnterprisePackage() {
		return (EnterprisePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EnterprisePackage getPackage() {
		return EnterprisePackage.eINSTANCE;
	}

} //EnterpriseFactoryImpl
