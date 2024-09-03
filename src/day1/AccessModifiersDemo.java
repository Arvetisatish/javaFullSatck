package day1;

class DefaultClass {
    void display() {
        System.out.println("Default access: Only accessible within the same package.");
    }
}

public class AccessModifiersDemo {
    // Public variable
    public String publicVar = "Public Variable: Accessible everywhere.";

    // Private variable
    private String privateVar = "Private Variable: Accessible only within this class.";

    // Protected variable
    protected String protectedVar = "Protected Variable: Accessible within the package and subclasses.";

    // Default variable (no modifier)
    String defaultVar = "Default Variable: Accessible within the package.";

    // Public method
    public void showPublic() {
        System.out.println(publicVar);
    }

    // Private method
    private void showPrivate() {
        System.out.println(privateVar);
    }

    // Protected method
    protected void showProtected() {
        System.out.println(protectedVar);
    }

    // Default method
    void showDefault() {
        System.out.println(defaultVar);
    }

    // Method to demonstrate private access within the same class
    public void accessPrivateMethod() {
        showPrivate(); // Allowed because it's within the same class
    }

    public static void main(String[] args) {
        AccessModifiersDemo demo = new AccessModifiersDemo();

        // Accessing public member
        demo.showPublic();

        // Accessing private member (from within the same class)
        demo.accessPrivateMethod();

        // Accessing protected member
        demo.showProtected();

        // Accessing default member
        demo.showDefault();

        // Accessing default method from another class within the same package
        DefaultClass defaultClass = new DefaultClass();
        defaultClass.display();
    }
}

