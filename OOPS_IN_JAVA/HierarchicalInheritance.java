// Parent Class
class Animal {
    void eat() {
        System.out.println("This animal can eat.");
    }
}

// Child Class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Child Class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // Inherited from Animal
        d.bark(); // Defined in Dog class

        Cat c = new Cat();
        c.eat();  // Inherited from Animal
        c.meow(); // Defined in Cat class
    }
}
