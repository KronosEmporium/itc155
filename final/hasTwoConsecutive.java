//*******************************************************************
//
//  hasTwoConsecutive.java
//
// Implements a method hasTwoConsecutive(ListNode) which iterates
// through nodes in a LinkedList to determine if, at any point,
// the current node's alue and the next node's value are
// consecutive integers (increasing by one whole integer from the
// current node's integer).
//
// By: Crosby Allison
// Date: 6/15/2020
//*******************************************************************

public class hasTwoConsecutive {

    public static boolean hasTwoConsecutive(ListNode front) {
        ListNode current = front;
        if (front == null) {
            return false;
        }
        else {
            while (current.next != null) {
                if (current.data + 1 == current.next.data) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        ListNode list;
        list = new ListNode();

        list.data = 1;
        list.next = new ListNode();
        list.next.data = 18;
        list.next.next = new ListNode();
        list.next.next.data = 2;
        list.next.next.next = new ListNode();
        list.next.next.next.data = 7;
        list.next.next.next.next = new ListNode();
        list.next.next.next.next.data = 8;
        list.next.next.next.next.next = new ListNode();
        list.next.next.next.next.next.data = 39;
        list.next.next.next.next.next.next = new ListNode();
        list.next.next.next.next.next.next.data = 18;
        list.next.next.next.next.next.next.next = new ListNode();
        list.next.next.next.next.next.next.next.data = 40;

        System.out.println( hasTwoConsecutive(list) );
    }
}

