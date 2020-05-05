//*******************************************************************
//
//  isUnique.java
//
// Contains a method isUnique(Map<String, String>) that returns true
// if no two keys map to the same value and returns false if two keys
// do map to the same value.
//
// By: Crosby Allison
// Date: 5/5/2020
//*******************************************************************

import java.util.*;

public class Main {

	public static boolean isUnique (Map<String, String> map) {
		Set<String> setKey = map.keySet();
	    Collection<String> collectionValue = map.values();
	    Set<String> setValue = new HashSet<String>(collectionValue);
	    return setKey.size() == setValue.size();
	}

	public static void main (String[] args) {

		// Testing unique map
		// {Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}

		Map<String, String> unique = new HashMap<String, String>();
		unique.put("Marty", "Stepp");
		unique.put("Stuart", "Reges");
		unique.put("Jessica", "Miller");
		unique.put("Amanda", "Camp");
		unique.put("Hal", "Perkins");
		System.out.println("Unique test: " + isUnique(unique));

		// Testing non-unique map
		//{Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins}

		Map<String, String> notUnique = new HashMap<String, String>();
		notUnique.put("Kendrick", "Perkins");
		notUnique.put("Stuart", "Reges");
		notUnique.put("Jessica", "Miller");
		notUnique.put("Bruce", "Reges");
		notUnique.put("Hal", "Perkins");
		System.out.println("Non-unique test: " + isUnique(notUnique));
	}
}