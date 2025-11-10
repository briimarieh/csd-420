/*
Brianne Hulgan
11-09-2025
CSD420-H307
Module 3 Assignment 1
A program that contains a static method that returns a
new ArrayList without duplicates
*/

/*
Resources
W3Schools. (2019). Java ArrayList. W3schools.com; W3schools. https://www.w3schools.com/java/java_arraylist.asp
W3schools.(2025). Java LinkedHashSet. W3schools.com; W3schools. https://www.w3schools.com/java/java_linkedhashset.asp
*/

// Import classes
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;

public class HulganArrayList {

    public static void main(String args[]) {
        
        // Initialize variables
        ArrayList<Integer>originalList = new ArrayList<>();
        Random rand = new Random();
        
        // Add 50 random integers from 1-20 to ArrayList
        for (int i = 0; i < 50; i++) {
            int randomInt = rand.nextInt(20) + 1; // gives 1-20
            originalList.add(randomInt);
        }
        
        // Print original array
        System.out.println("Original list: " + originalList);
        
        // Call static method to remove duplicates
        ArrayList<Integer> newList = removeDuplicates(originalList);
        
        // Print new array
        System.out.println("New list: " + newList);

    }
    
    // Static method that removes duplicate numbers from original list
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }
}