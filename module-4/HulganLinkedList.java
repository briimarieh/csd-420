/*
Brianne Hulgan
11-09-2025
CSD420-H307
Module 4 Assignment 1
A program that
*/

/*
Resources
W3Schools. (n.d.). Java Iterator. Www.w3schools.com; W3Schools. https://www.w3schools.com/java/java_iterator.asp
W3Schools. (2025). Java System Methods. W3schools.com; W3Schools. https://www.w3schools.com/java/java_ref_system.asp
W3Schools. (n.d.). Java LinkedList. Www.w3schools.com; w3Schools. https://www.w3schools.com/java/java_linkedlist.asp
W3Schools. (2020). Java Method Parameters. W3schools.com; W3Schools. https://www.w3schools.com/java/java_methods_param.asp
*/

// Import classes
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class HulganLinkedList {

    public static void main(String args[]) {
        
        System.out.println("Testing with 50,000 integers:");
        linkedListTraversal(50000);
        
        System.out.println("\nTesting with 500,000 integers:");
        linkedListTraversal(500000);
    }
    
    public static void linkedListTraversal(int size) {
        
                
        // Initialize variables
        LinkedList<Integer> numbers = new LinkedList<>();
        Random rand = new Random();
        
        // Add integers to list
        for (int i = 0; i < size; i++) {
            int randomInt = rand.nextInt(100); // random integer 0-99
            numbers.add(randomInt);
        }
        
        // Traverse using Iterator
        long startIt = System.nanoTime();
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            it.next();
        }
        long endIt = System.nanoTime();
        long timeIt = endIt - startIt;
        
        // Traverse using get(index)
        long startGet = System.nanoTime();
        for (int i = 0; i < numbers.size(); i++){
            numbers.get(i);
        }
        long endGet = System.nanoTime();
        long timeGet = endGet - startGet;
        
        // Print results
        System.out.printf("\nTime it took to traverse LinkedList with iterator: %,d nanoseconds%n", timeIt);
        System.out.printf("Time it took to traverse LinkedList with get(index): %,d nanoseconds%n", timeGet);
        
        // Check code
        if (numbers.size() == size) {
            System.out.println("\nTest passed: The LinkedList has the correct number of integers.");
        } else {
            System.out.println("\nTest failed: The LinkedList does not have the correct number of integers.");
        }
    }
}

/*
Results:
On my final run, for 50,000 integers, it took 2,078,541 nanoseconds for an iterator and 1,012,221,917 nanoseconds for the get(index) method.
For 500,000 integers, it took 4,522,042 nanoseconds for an iterator and 103,708,404,792 nanoseconds for the get(index) method.
Both tests show that traversing through a LinkedList with an iterator is the more efficient method between an iterator and the get(index) method.
*/