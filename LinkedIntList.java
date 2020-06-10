//*******************************************************************
//
//  LinkedIntList.java
//
// Class LinkedIntList implements a method isSorted() that iterates
// over a linked list, returning true if the LinkedList is sorted
// in ascending order and returning false if not in ascending order.
//
// By: Crosby Allison
// Date: 6/9/2020
//*******************************************************************

import java.util.*;

public class LinkedIntList {
    private ListNode front;

    public boolean isSorted() {
        ListNode node = front;
        
        if (front == null) {
            return true;
        }
        
        while (node.next != null) {
            ListNode cur = node.next;
            if (cur.data < node.data) {
                return false;
            }
            node = cur;
        }
        
        return true;
    }
}