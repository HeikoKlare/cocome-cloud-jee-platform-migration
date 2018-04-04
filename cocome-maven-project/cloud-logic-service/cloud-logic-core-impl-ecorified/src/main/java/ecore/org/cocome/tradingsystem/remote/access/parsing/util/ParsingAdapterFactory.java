/**
 */
package ecore.org.cocome.tradingsystem.remote.access.parsing.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import ecore.org.cocome.tradingsystem.remote.access.parsing.CSVHelper;
import ecore.org.cocome.tradingsystem.remote.access.parsing.MessageToCSV;
import ecore.org.cocome.tradingsystem.remote.access.parsing.ParserPostMessage;
import ecore.org.cocome.tradingsystem.remote.access.parsing.ParsingPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.ParsingPackage
 * @generated
 */
public class ParsingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ParsingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParsingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ParsingPackage.eINSTANCE;
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
	protected ParsingSwitch<Adapter> modelSwitch =
		new ParsingSwitch<Adapter>() {
			@Override
			public Adapter caseCSVHelper(CSVHelper object) {
				return createCSVHelperAdapter();
			}
			@Override
			public Adapter caseMessageToCSV(MessageToCSV object) {
				return createMessageToCSVAdapter();
			}
			@Override
			public Adapter caseParserPostMessage(ParserPostMessage object) {
				return createParserPostMessageAdapter();
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
	 * Creates a new adapter for an object of class '{@link ecore.org.cocome.tradingsystem.remote.access.parsing.CSVHelper <em>CSV Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.CSVHelper
	 * @generated
	 */
	public Adapter createCSVHelperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore.org.cocome.tradingsystem.remote.access.parsing.MessageToCSV <em>Message To CSV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.MessageToCSV
	 * @generated
	 */
	public Adapter createMessageToCSVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore.org.cocome.tradingsystem.remote.access.parsing.ParserPostMessage <em>Parser Post Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore.org.cocome.tradingsystem.remote.access.parsing.ParserPostMessage
	 * @generated
	 */
	public Adapter createParserPostMessageAdapter() {
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

} //ParsingAdapterFactory
