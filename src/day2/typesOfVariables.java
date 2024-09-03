package day2;

 class Employee {
     // Declare instance variables.
     private String name;
     private int id;

     // Declare a static variable companyName with data type String and assign value "TNS" which is common for all the objects.
     static String companyName = "TNS";

     // Declare a two-parameter constructor with parameters named n and i.
     Employee(String name, int id) {
         this.name = name;
         this.id = id;
     }

     @Override
     public String toString() {
         return "Employee [name=" + name + ", id=" + id + ", Company= " + companyName + "]";
     }
 }

    public class typesOfVariables {

        public static void main(String[] args) {
            // Create Employee objects
            Employee emp1 = new Employee("Alice", 101);
            Employee emp2 = new Employee("Bob", 102);

            // Print the details of employees
            System.out.println(emp1);
            System.out.println(emp2);

            // Demonstrate that the static variable is shared across instances
            Employee.companyName = "Tech Solutions";

            // Print the details of employees again to show the updated company name
            System.out.println(emp1);
            System.out.println(emp2);
        }
    }

