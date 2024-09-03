package day4;

public class TryCatchExample {

    public static void main(String[] args) {
        // Example of handling an arithmetic exception
        try {
            // Code that may throw an exception
            int division = 10 / 0; // This will throw an ArithmeticException
            System.out.println("Result: " + division);
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Cannot divide by zero!");
        }

        // The program continues even after the exception
        System.out.println("End of program.");
    }
}

