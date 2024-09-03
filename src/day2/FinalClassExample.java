package day2;

final class FinalClass {
    public void show() {
        System.out.println("This is a final class and cannot be subclassed.");
    }
}



public class FinalClassExample {
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
        finalClass.show();
    }
}

