/*
Brianne Hulgan
11-02-2025
CSD420-H307
Module 2 Assignment 1
A program that reads a file and displays the data
*/

/*
Resources
W3Schools. “Java Arrays.” W3schools.com, 2019, www.w3schools.com/java/java_arrays.asp.
“W3Schools.com.” W3schools.com, 2025, www.w3schools.com/java/java_bufferedreader.asp.
‌“W3Schools.com.” W3schools.com, 2025, www.w3schools.com/java/java_files_write.asp.
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