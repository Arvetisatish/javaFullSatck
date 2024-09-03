package day2;

public class encapsulation2 {
    public static void main(String[] args) {
        // Creating a Student object using the no-argument constructor
        Student student1 = new Student();
        student1.setRollNo(101);
        student1.setName("John Smith");
        student1.setPer(85.5f);

        // Displaying the student1 details
        System.out.println(student1);

        // Creating a Student object using the parameterized constructor
        Student student2 = new Student(102, "Alice Johnson", 92.3f);

        // Displaying the student2 details
        System.out.println(student2);
    }
}
