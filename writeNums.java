//*******************************************************************
//
//  writeNums.java
//
// Main class uses a method writeNums(int n) which prints the first
// integers up to the given integer n separated by a comma and a
// space. If the number is less than zero, throws an exception of
// type IllegalArgumentException.
//
// By: Crosby Allison
// Date: 5/11/2020
//*******************************************************************

public class Main {
	
	public static void writeNums (int n) {
    
	    if (n < 1) {
	        throw new IllegalArgumentException();
	    } else if (n == 1) {
	        System.out.print("1");
	    } else {
	        writeNums(n - 1);
	        System.out.print(", " + n);
	    }
	}

	public static void main (String[] args) {

		writeNums(5);
		
	}
}