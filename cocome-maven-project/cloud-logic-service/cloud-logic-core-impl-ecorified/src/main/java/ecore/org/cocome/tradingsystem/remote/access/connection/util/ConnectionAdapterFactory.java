/**
 */
package ecore.org.cocome.tradingsystem.remote.access.connection.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection;
import ecore.org.cocome.tradingsystem.remote.access.connection.ConnectionPackage;
import ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend;
import ecore.org.cocome.tradingsystem.remote.access.connection.QueryParameterEncoder;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ecore.org.cocome.tradingsystem.remote.access.connection.ConnectionPackage
 * @generated
 */
public class ConnectionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConnectionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ConnectionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionSwitch<Adapter> modelSwitch =
		new ConnectionSwitch<Adapter>() {
			@Override
			public Adapter caseCSVBackendConnection(CSVBackendConnection object) {
				return createCSVBackendConnectionAdapter();
			}
			@Override
			public Adapter caseGetXMLFromBackend(GetXMLFromBackend object) {
				return createGetXMLFromBackendAdapter();
			}
			@Override
			public Adapter caseQueryParameterEncoder(QueryParameterEncoder object) {
				return createQueryParameterEncoderAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection <em>CSV Backend Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.CSVBackendConnection
	 * @generated
	 */
	public Adapter createCSVBackendConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend <em>Get XML From Backend</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.GetXMLFromBackend
	 * @generated
	 */
	public Adapter createGetXMLFromBackendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore.org.cocome.tradingsystem.remote.access.connection.QueryParameterEncoder <em>Query Parameter Encoder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore.org.cocome.tradingsystem.remote.access.connection.QueryParameterEncoder
	 * @generated
	 */
	public Adapter createQueryParameterEncoderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ConnectionAdapterFactory
