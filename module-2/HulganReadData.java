/*
Brianne Hulgan
11-02-2025
CSD420-H307
Module 2 Assignment 1
A program that reads a file and displays the data
*/

// Import classes
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HulganReadData {

    public static void main(String[] args) {

        // Initialize variables
        String fileName = "hulgandatafile.dat";
        
        // Read and display file contents
        try (BufferedReader myReader = new BufferedReader(new FileReader(fileName))) {
            
            String line;
            
            while ((line = myReader.readLine()) != null) {
                System.out.println(line);
            }
            
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace(System.err);
        }
    }
}