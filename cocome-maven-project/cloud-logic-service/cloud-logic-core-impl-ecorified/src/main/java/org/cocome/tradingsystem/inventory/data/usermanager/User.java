package org.cocome.tradingsystem.inventory.data.usermanager;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.cocome.tradingsystem.inventory.application.usermanager.CredentialTO;
import org.cocome.tradingsystem.inventory.application.usermanager.CredentialType;
import org.cocome.tradingsystem.inventory.application.usermanager.CredentialTypeNotFoundException;
import org.cocome.tradingsystem.inventory.application.usermanager.Role;
import org.cocome.tradingsystem.inventory.application.usermanager.UserTO;
import org.cocome.tradingsystem.inventory.application.usermanager.credentials.ICredential;
import org.cocome.tradingsystem.util.qualifier.CredentialLiteral;

/**
 * Represents a user of the system.
 * 
 * @author Tobias Pöppke
 * @author Robert Heinrich
 */
@Dependent
public
class User extends unification.org.cocome.tradingsystem.inventory.data.usermanager.UnifiedUser implements IUser, Serializable {
	private static long serialVersionUID = 1L;

	private static Logger LOG = Logger.getLogger(User.class);
	
	@Inject @Any
	private
	Instance<ICredential> credentialInstance;
	
	protected void initRoles() {
		// No default roles for a user
	}
	
	Instance<ICredential> getCredentialInstance() {
		return credentialInstance;
	}

	void setCredentialInstance(Instance<ICredential> credentialInstance) {
		this.credentialInstance = credentialInstance;
	}

	private static Logger getLOG() {
		return LOG;
	}

	private static void setLOG(Logger lOG) {
		LOG = lOG;
	}

	private static long getSerialVersionUID() {
		return serialVersionUID;
	}

	private static void setSerialVersionUID(long serialVersionUID) {
		User.serialVersionUID = serialVersionUID;
	}

	protected void initCredentials() {
		// No default credentials
	}
	
	@PostConstruct
	public void initUser() {
		initRoles();
		initCredentials();
	}
	
	public void initUser(UserTO userTO) {
		this.setUsername(userTO.getUsername());
		
		for (CredentialTO cred : userTO.getCredentials()) {
			ICredential credential = getCredentialInstance().select(
					new CredentialLiteral(cred.getType())).get();
			credential.setCredentialChars(cred.getCredentialChars());
			getCredentials().put(cred.getType(), credential);
		}
		
		// Don't initialize the roles from the passed in TO but query them from the database
	}
	
	@Override
	public void addCredential(ICredential credential) {
		if (!getCredentials().containsKey(credential.getType())) {
			getCredentials().put(credential.getType(), credential);
		}
	}
	
	@Override
	public void removeCredential(CredentialType credentialType) {
		getCredentials().remove(credentialType);
	}

	@Override
	public boolean checkCredential(ICredential credential) {
		ICredential storedCred = getCredentials().get(credential.getType());
		boolean result = false;
		if (storedCred != null) {
			result = storedCred.isMatching(credential);
		}
		return result;
	}
	
	@Override
	public boolean checkUserCredentials(IUser userToCheck) {
		boolean result = false;
		
		getLOG().debug("Usernames " + getUsername() + " and " + userToCheck.getUsername());
		
		// Username has to match as part of the credentials
		if (getUsername().equals(userToCheck.getUsername())) {
			result = true;
		}
		
		for (ICredential credential : getCredentials().values()) {
			ICredential credToCheck = userToCheck.getCredential(credential.getType());
			if (credToCheck == null) {
				// No credential of the given type found
				getLOG().info("Missing credential of type: " + credential.getType());
				continue;
			}
			
			getLOG().debug("Checking credential with type " + credToCheck.getType());
			
			if (credToCheck.getType() == CredentialType.AUTH_TOKEN) {
				// If an authentication token is present, check only this token
				result = credential.isMatching(credential);
				break;
			}
			
			result = credential.isMatching(credToCheck) ? result : false;
		}
		getLOG().debug("Endresult was " + result);
		return result;
	}

	@Override
	public boolean hasRole(Role role) {
		getLOG().debug("Checking for permission " + role.label() + " in " + getRoles().toString());
		return getRoles().contains(role);
	}

	@Override
	public void addRole(Role role) {
		if (role != null) {
			getLOG().debug("Adding role " + role.label() + " to user " + getUsername());
			getRoles().add(role);
		}
	}

	@Override
	public void withdrawRole(Role role) {
		getLOG().debug("Withdrawing role " + role.label() + " from user " + getUsername());
		getRoles().remove(role);
	}
	
	@Override
	public String resetCredential(CredentialType credentialType) throws CredentialTypeNotFoundException {
		ICredential cred = getCredentials().get(credentialType);
		if (cred != null) {
			return new String(cred.resetCredential(this));
		}
		throw new CredentialTypeNotFoundException("No credential with the type " + credentialType + "registered!");
	}

	@Override
	public ICredential getCredential(CredentialType credentialType) {
		return getCredentials().get(credentialType);
	}

//	@Override
//	public boolean isLoggedIn() {
//		return loggedIn;
//	}
//
//	@Override
//	public boolean logOut() {
//		this.loggedIn = false;
//		return true;
//	}
//
//	@Override
//	public void logIn() {
//		try {
//			LOG.debug("Trying to login as " + username);
//			loggedIn = authenticator.checkCredentials(this);
//		} catch (NotInDatabaseException e) {
//			loggedIn = false;
//			LOG.error("Login for user " + username + " failed!");
//		}
//	}
}
