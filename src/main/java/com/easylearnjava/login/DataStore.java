package com.easylearnjava.login;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rnr
 *
 *This class is a temporary database for the application.
 *Returns a matching value for the key from the hashmapDB.
 *If the key match is not found then null will be returned.  
 */
public class DataStore {
	
	Map<String, String> hashMapDB = new HashMap<String, String>();

	public String getUserPassowrd(String userName){

		populateDummyData();
		//"null" will be returned if the userName match is not found in the hashMap
		String storedPassword = hashMapDB.get(userName);
		return storedPassword;
	}
	
	private void populateDummyData(){
		
		hashMapDB.put("raghu", "secret");
		hashMapDB.put("naveen", "topsecret");		
	}
}
