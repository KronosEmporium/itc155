//*******************************************************************
//
//  Asmt3.java
//
// Contains the methods removeEvenLength and doubleList. Both
// functions take an ArrayList<String> as a parameter.
// removeEvenLength returns a new ArrayList<String> with all even-
// lettered strings removed from the input array. doubleList
// returns a new ArrayList<String> with all strings from the input
// array added twice.
//
// By: Crosby Allison
// Date: 4/28/2020
//*******************************************************************

import java.util.ArrayList;

public class Main {

	public static ArrayList<String> removeEvenLength (ArrayList<String> arr) {

		ArrayList<String> newArr = new ArrayList<String>();

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).length() % 2 != 0) {
				newArr.add(arr.get(i));
			}
		}

		return newArr;
	}
	
	public static ArrayList<String> doubleList (ArrayList<String> arr) {
	    
	    ArrayList<String> newArr = new ArrayList<String>();
	    
	    for (int i = 0; i < arr.size(); i++) {
	        newArr.add(arr.get(i));
	        newArr.add(arr.get(i));
	    }
	    
	    return newArr;
	}

	public static void main (String[] args) {
	    
	    // removeEvenLength test 
		ArrayList<String> evenStrList = new ArrayList<String>();
        ArrayList<String> newEvenStrList = new ArrayList<String>();
        
		evenStrList.add("frog");
		evenStrList.add("horse");
		evenStrList.add("dog");
		evenStrList.add("fish");

        newEvenStrList = removeEvenLength(evenStrList);
        
        System.out.println("removeEvenLength result:");
		for (int i = 0; i < newEvenStrList.size(); i++) {
			System.out.println(newEvenStrList.get(i));
		}
		
		// doubleList test
		ArrayList<String> doubleStrList = new ArrayList<String>();
		ArrayList<String> newDoubleStrList = new ArrayList<String>();
		
		doubleStrList.add("how");
		doubleStrList.add("are");
		doubleStrList.add("you");
		
		newDoubleStrList = doubleList(doubleStrList);
		
		System.out.println("\ndoubleList result:");
		for (int i = 0; i < newDoubleStrList.size(); i++) {
		    System.out.println(newDoubleStrList.get(i));
		}
	}
}