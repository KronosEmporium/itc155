import java.util.Scanner;

public class DescendingOrder {
    
    public static void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
    
    // TODO: Write a void method selectionSortDescendTrace() that takes 
    // an integer array and the number of elements in the array as arguments, 
    // and sorts the array into descending order.
    public static void selectionSortDescendTrace(int [] numbers, int numElements) {
        
        for (int i = 0; i < numElements - 1; i++) {
            int largest = i;
            
            for (int j = i + 1; j < numElements; j++) {
                if (numbers[j] > numbers[largest]) {
                    largest = j;
                }
                swap(numbers, i, largest);
                
            }
            printArrayStep(numbers, numElements);
        }
    }
    
    public static void printArrayStep(int[] numbers, int numElements) {
        
        for (int i = 0; i < numElements; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        int input, i = 0;
        int numElements = 0;
        int [] numbers = new int[10];
        
        // TODO: Read in a list of up to 10 positive integers; stop when
        // -1 is read. Then call selectionSortDescendTrace() method.
        while (scnr.hasNext()) {
            
            input = scnr.nextInt();
            
            if (input < 0) {
                break;
            }
            
            numbers[i] = input;
            i++;
        }
    
        numElements = i;
        
        selectionSortDescendTrace(numbers, numElements);
    }
}