package day3;



// Derived class (Parent)
class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal walks.");
    }
}

// Derived class (Child)


public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited from Animal
        //dog.walk(); // Inherited from Mammal
        dog.bark(); // Specific to Dog
        Mammal mamal= new Mammal();
        mamal.walk();
        mamal.eat();
    }
}
