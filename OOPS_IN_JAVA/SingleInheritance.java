// Parent Class
class Animal {
    void eat() {
        System.out.println("This animal can eat.");
    }
}

// Child Class (inherits Animal)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Correct Class Name (Avoid Duplicate Errors)
public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog(); //  Object creation is valid inside main()
        d.eat();  // Inherited from Animal
        d.bark(); // Defined in Dog class
    }
}
