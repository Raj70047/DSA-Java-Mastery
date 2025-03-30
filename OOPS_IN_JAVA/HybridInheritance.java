// Parent Interface 1
interface Animal {
    void eat();
}

// Parent Interface 2
interface Canine {
    void bark();
}

// Child Class implementing multiple interfaces
class Dog implements Animal, Canine {
    public void eat() {
        System.out.println("Dog eats food.");
    }

    public void bark() {
        System.out.println("Dog barks.");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // From Animal interface
        d.bark(); // From Canine interface
    }
}
