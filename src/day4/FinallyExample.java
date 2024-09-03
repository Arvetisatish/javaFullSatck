package day4;

import java.io.*;

public class FinallyExample {

    public static void main(String[] args) {
        FileReader file = null;
        try {
            file = new FileReader("test.txt");
            BufferedReader fileInput = new BufferedReader(file);

            // Print the first line of the file
            System.out.println(fileInput.readLine());
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        } finally {
            // Closing the file resource in the finally block
            try {
                if (file != null) {
                    file.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the file.");
            }
            System.out.println("Finally block executed.");
        }
    }
}
