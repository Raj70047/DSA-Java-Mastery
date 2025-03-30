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

// Grandchild Class (inherits Dog)
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps.");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();  //  Inherited from Animal
        p.bark(); //  Inherited from Dog
        p.weep(); //  Defined in Puppy class
    }
}

