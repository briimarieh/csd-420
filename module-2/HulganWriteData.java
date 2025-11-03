/*
Brianne Hulgan
11-02-2025
CSD420-H307
Module 2 Assignment 1
A program that stores an array of five random integers
and an array of five random doubles
*/

// Import classes
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class HulganWriteData {

    public static void main(String[] args) {
        
        // Initialize variables
        int[] intArray = new int[5];
        double[] doubleArray = new double[5];
        Random rand = new Random();
        String fileName = "hulgandatafile.dat";

        // Create and write to file
        try (FileWriter myWriter = new FileWriter(fileName, true)){

            myWriter.write("\n===================\nNew Data Run\n===================\n");
            
            // Write random integers
            myWriter.write("Integers: ");
            for (int i = 0; i < intArray.length; i++) {
                int randomInt = rand.nextInt(100); // 0-99
                myWriter.write(randomInt + (i < intArray.length - 1 ? ", " : ""));
            }
            myWriter.write("\n\n");
            
            // Write random doubles
            myWriter.write("Doubles: ");
            for (int i = 0; i < doubleArray.length; i++) {
                double randomDouble = rand.nextDouble(1.00, 100.00); // 1.00-99.99
                myWriter.write(String.format("%.2f", randomDouble) + (i < doubleArray.length - 1 ? ", " : ""));
            }
            myWriter.write("\n");
            
            System.out.println("Data successfully written to " + fileName);
            
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace(System.err);
        }
    }
}