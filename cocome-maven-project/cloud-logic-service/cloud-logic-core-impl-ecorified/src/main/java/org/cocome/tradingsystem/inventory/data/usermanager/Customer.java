package org.cocome.tradingsystem.inventory.data.usermanager;

import java.io.Serializable;
import java.util.Set;

import javax.enterprise.context.Dependent;

/**
 * Represents a customer of the pickup shop.
 * 
 * @author Tobias Pöppke
 * @author Robert Heinrich
 */
@Dependent
public
class Customer extends unification.org.cocome.tradingsystem.inventory.data.usermanager.UnifiedCustomer implements Serializable, ICustomer {
	private static long serialVersionUID = 1L;
	
	private static long getSerialVersionUID() {
		return serialVersionUID;
	}

	private static void setSerialVersionUID(long serialVersionUID) {
		Customer.serialVersionUID = serialVersionUID;
	}

	/* (non-Javadoc)
	 * @see org.cocome.tradingsystem.usermanager.ICustomer#getCreditCardInfo()
	 */
	@Override
	public Set<String> getCreditCardInfo() {
		return getCreditCardInfoSet();
	}

	/* (non-Javadoc)
	 * @see org.cocome.tradingsystem.usermanager.ICustomer#setCreditCardInfo(java.util.Set)
	 */
	@Override
	public void setCreditCardInfo(Set<String> creditCardInfo) {
		this.setCreditCardInfoSet(creditCardInfo);
	}
	
	/* (non-Javadoc)
	 * @see org.cocome.tradingsystem.usermanager.ICustomer#addCreditCardInfo(java.lang.String)
	 */
	@Override
	public void addCreditCardInfo(String creditCardInfo) {
		if (creditCardInfo != null && !creditCardInfo.isEmpty()) {
			// TODO Add some validity check for this info perhaps
			getCreditCardInfoSet().add(creditCardInfo);
		}
	}
	
	/* (non-Javadoc)
	 * @see org.cocome.tradingsystem.usermanager.ICustomer#removeCreditCardInfo(java.lang.String)
	 */
	@Override
	public void removeCreditCardInfo(String creditCardInfo) {
		getCreditCardInfoSet().remove(creditCardInfo);
	}

	@Override
	public long getID() {
		return getId();
	}

	@Override
	public void setID(long customerID) {
		this.setId(customerID);
	}
}
