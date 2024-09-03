package day1;

class Example {
    int x;
    String y;

    // Default Constructor
    Example() {
        System.out.println("Default Constructor called");
        x = 0;
        y = "default";
    }

    // Parameterized Constructor
    Example(int a) {
        System.out.println("Parameterized Constructor with one argument called");
        x = a;
        y = "default";
    }

    // Parameterized Constructor with two arguments
    Example(int a, String b) {
        System.out.println("Parameterized Constructor with two arguments called");
        x = a;
        y = b;
    }

    // Copy Constructor
    Example(Example ex) {
        System.out.println("Copy Constructor called");
        x = ex.x;
        y = ex.y;
    }




    // Display method to show the values
    void display() {
        System.out.println("x: " + x + ", y: " + y);
    }

    public static void main(String[] args) {
        // Using Default Constructor
        Example ex1 = new Example();
        ex1.display();

        // Using Parameterized Constructor with one argument
        Example ex2 = new Example(5);
        ex2.display();

        // Using Parameterized Constructor with two arguments
        Example ex3 = new Example(10, "Hello");
        ex3.display();

        // Using Copy Constructor
        Example ex4 = new Example(ex3);
        ex4.display();




    }
}

