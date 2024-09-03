package day4;

public class MultipleCatchExample {

    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = numbers[5] / 0; // This will cause ArrayIndexOutOfBoundsException first
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Index out of bounds!");
        }

        System.out.println("End of program.");
    }
}
