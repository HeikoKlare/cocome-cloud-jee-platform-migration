package org.cocome.tradingsystem.inventory.data.usermanager;

import java.util.ArrayList;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Provider;

import org.cocome.tradingsystem.inventory.application.store.CustomerWithStoreTO;
import org.cocome.tradingsystem.inventory.application.usermanager.CredentialTO;
import org.cocome.tradingsystem.inventory.application.usermanager.CredentialType;
import org.cocome.tradingsystem.inventory.application.usermanager.Role;
import org.cocome.tradingsystem.inventory.application.usermanager.UserTO;
import org.cocome.tradingsystem.inventory.application.usermanager.credentials.ICredential;
import org.cocome.tradingsystem.inventory.data.store.IStoreDataFactory;

@Dependent
public
class UsermanagerDatatypesFactory extends unification.org.cocome.tradingsystem.inventory.data.usermanager.UnifiedUsermanagerDatatypesFactory implements IUserDataFactory {

	@Inject
	private
	Provider<User> userProvider;
	
	@Inject
	private
	Provider<Customer> customerProvider;
	
	@Inject
	private
	IStoreDataFactory storeDatatypes;
	
	@Override
	public IUser getNewUser() {
		return getUserProvider().get();
	}
	
	IStoreDataFactory getStoreDatatypes() {
		return storeDatatypes;
	}

	void setStoreDatatypes(IStoreDataFactory storeDatatypes) {
		this.storeDatatypes = storeDatatypes;
	}

	Provider<Customer> getCustomerProvider() {
		return customerProvider;
	}

	void setCustomerProvider(Provider<Customer> customerProvider) {
		this.customerProvider = customerProvider;
	}

	Provider<User> getUserProvider() {
		return userProvider;
	}

	void setUserProvider(Provider<User> userProvider) {
		this.userProvider = userProvider;
	}

	@Override
	public CustomerWithStoreTO fillCustomerWithStoreTO(ICustomer customer) {
		final CustomerWithStoreTO result = new CustomerWithStoreTO();
		
		result.setId(customer.getID());
		result.setUsername(customer.getUser().getUsername());
		result.setRoles(new ArrayList<Role>(customer.getUser().getRoles()));
		result.setCreditCardInfos(new ArrayList<String>(customer.getCreditCardInfo()));
		result.setFirstName(customer.getFirstName());
		result.setLastName(customer.getLastName());
		result.setMailAddress(customer.getMailAddress());
		result.setPreferredStoreTO(
				customer.getPreferredStore() != null ? getStoreDatatypes().fillStoreTO(customer.getPreferredStore()) : null);
		
		return result;
	}

	@Override
	public CredentialTO fillCredentialTO(ICredential credential) {
		final CredentialTO result = new CredentialTO();
		
		result.setType(credential.getType());
		result.setCredentialChars(credential.getCredentialChars());
		
		return result;
	}

	@Override
	public UserTO fillUserTO(IUser user) {
		final UserTO result = new UserTO();
		
		result.setUsername(user.getUsername());
		result.setRoles(new ArrayList<Role>(user.getRoles()));
		
		// Only include authentication token if present and no other credentials
		ICredential authToken = user.getCredential(CredentialType.AUTH_TOKEN); 
		if (authToken != null) {
			ArrayList<CredentialTO> credentials = new ArrayList<>(1);
			credentials.add(fillCredentialTO(authToken));
			result.setCredentials(credentials);
		}
		
		return result;
	}

	@Override
	public IUser convertToUser(UserTO userTO) {
		IUser user = getNewUser();
		user.initUser(userTO);
		return user;
	}

	@Override
	public ICustomer getNewCustomer() {
		return getCustomerProvider().get();
	}

}
