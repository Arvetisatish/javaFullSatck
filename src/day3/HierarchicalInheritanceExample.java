package day3;

// Superclass
class Animall {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass 1
class Dogg extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Subclass 2
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Dogg dog = new Dogg();
        Cat cat = new Cat();

        dog.eat();  // Inherited from Animal
        dog.bark(); // Specific to Dog

        cat.eat();  // Inherited from Animal
        cat.meow(); // Specific to Cat
    }
}

