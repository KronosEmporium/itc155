//*******************************************************************
//
//  equals.java
//
// Implements a method equals(Stack<Integer>, Stack<Integer>) that
// checks two Stacks for equality of values at each position within
// the Stacks. Returns true if equal, false if not.
//
// By: Crosby Allison
// Date: 6/15/2020
//*******************************************************************

public class MyClass {
	public static boolean equals (Stack<Integer> s1, Stack<Integer> s2) 
	{
	    boolean equal = true;
	    Stack<Integer> temp = new Stack<Integer>();
	    
	    if (s1.size() != s2.size()) {
	        return false;
	    }

	    while (!s1.isEmpty()) {

	        int n1 = s1.pop();
	        int n2 = s2.pop();
	        temp.push(n1);
	        temp.push(n2);

	        if (n1 != n2) {
	            equal = false;
	            break;
	        }
	    }

	    while (!temp.isEmpty()) {
	        s2.push(temp.pop());
	        s1.push(temp.pop());
	    }
	    
	    return equal;
	}

	public static void main (String[] args)
	{
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();

		s1.push(42);
		s1.push(20);
		s1.push(30);

		s1.push(10);
		s1.push(20);
		s1.push(30);

		System.out.println( equals(s1, s2) );
	}
}