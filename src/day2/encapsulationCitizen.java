package day2;


public class encapsulationCitizen {
    public static void main(String[] args) {
        // Creating a Citizen object using the no-argument constructor
        Citizen citizen1 = new Citizen();
        citizen1.setName("John Doe");
        citizen1.setAadharNo("1234-5678-9012");
        citizen1.setAddress("123 Main St, Anytown, USA");
        citizen1.setPhno(9876543210L);

        System.out.println(citizen1);  // This will invoke the toString() method

        // Creating a Citizen object using the parameterized constructor
        Citizen citizen2 = new Citizen("Jane Doe", "9876-5432-1098", "456 Elm St, Anytown, USA", 1234567890L);

        System.out.println(citizen2);  // This will also invoke the toString() method
    }
}
