//*******************************************************************
//
//  selectionSort.java
//
// Ex. 4
//
// The complexity of the given algorithm would be O(N), because there
// is a single loop going over N number of elements contained in
// int[] list.
//
// Ex. 5
//
// The complexity of this algorithm is also O(N) because the array is
// just iterated over once.
//
//
// Public class Main provides a method largeSelectionSort(int[] list)
// that finds the largest unsorted element in an array and moves it
// to the last index, until the array is sorted in ascending order.
// This algorithm takes the same amount of time as a standard 
// selectionSort and it's complexity is still O(N^2) because it is
// iterating over the array within a for loop.
//
// By: Crosby Allison
// Date: 5/19/2020
//*******************************************************************

import java.util.Arrays;

public class Main {

	public static void largeSelectionSort(int[] list) {

		for (int i = list.length - 1; i > -1; i--) {
			int largest = i;
			for (int j = i - 1; j > -1; j--) {
				if (list[j] > list[largest]) {
					largest = j;
				}
			}
			swap(list, i, largest);
		}
	}
	
	public static void swap(int[] list, int i, int j) {
	    int temp = list[i];
	    list[i] = list[j];
	    list[j] = temp;
	}

	public static void main (String[] args) {

		int[] unsorted = new int[]{0,1,2,9,4,5,678,18};

		System.out.println("Unsorted:");
		System.out.println(Arrays.toString(unsorted));

		largeSelectionSort(unsorted);

		System.out.println("Sorted:");
		System.out.println(Arrays.toString(unsorted));
	}
}