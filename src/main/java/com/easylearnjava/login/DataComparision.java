package com.easylearnjava.login;

/**
 * @author rnr
 *
 *         This class does a password match with the password from the user and
 *         the password returned by the data store.
 */
public class DataComparision {

	public boolean validateUserInput(String userName, String passwordFromUser) {

		DataStore dataStore = new DataStore();
		String passwordFromDB = dataStore.getUserPassowrd(userName);

		// make sure that the string returned from the data store is not null
		// and If both the password match then return true
		if (null != passwordFromDB && passwordFromDB.equals(passwordFromUser)) {
			return true;
		}

		return false;
	}

}
