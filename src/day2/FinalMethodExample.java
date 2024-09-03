package day2;

class ParentClass {
    public final void displayMessage() {
        System.out.println("This is a final method and cannot be overridden.");
    }
}

class ChildClass extends ParentClass {
    // Attempting to override displayMessage() here would result in a compilation error.
    // public void displayMessage() {
    //     System.out.println("Trying to override the final method.");
    // }
}

public class FinalMethodExample {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.displayMessage();
    }
}

