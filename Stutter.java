//*******************************************************************
//
//  StacksAndQueues.java
//
// Implements methods stutter(Stack<integer> s) and 
// isPalindrome(Queue<Integer> q);. stutter takes a Stack<Integer> s
// and modifies the input Stack to have each value doubled at it's
// position in the Stack. isPalindrome takes a Queue<Integer> and
// returns true if the values of the Queue are the same if moving
// forwards through the first half of the Queue and moving backward
// through the second half.
//
// By: Crosby Allison
// Date: 6/2/2020
//*******************************************************************

import java.util.*;

public class StacksAndQueues {

    public static void stutter (Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<Integer>();
        while (!s.isEmpty()) {
            int n = s.pop();
            q.add(n);
        }
        while (!q.isEmpty()) {
            int n = q.remove();
            s.push(n);
        }
        while (!s.isEmpty()) {
            int n = s.pop();
            q.add(n);
        }
        while (!q.isEmpty()) {
            int n = q.remove();
            s.push(n);
            s.push(n);
        }
        
        System.out.println(s);
    }

    public static boolean isPalindrome (Queue<Integer> q) {
        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0; i < q.size(); i++) {
            int n = q.remove();
            q.add(n);
            s.push(n);
        }
        
        boolean same = true;
        
        for (int i = 0; i < q.size(); i++) {
            int n = q.remove();
            if (!s.pop().equals(n)) {
                same = false;
            }
            q.add(n);
        }
        return same;
    }

    public static void main (String[] args) {

        // testing stutter method
        Stack<Integer> s = new Stack<Integer>();
        s.push(3);
        s.push(7);
        s.push(1);
        s.push(14);
        s.push(9);

        // testing isPalindrome method
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(3);
        q.add(8);
        q.add(17);
        q.add(9);
        q.add(17);
        q.add(8);
        q.add(3);
        System.out.println(isPalindrome(q));
    }
}