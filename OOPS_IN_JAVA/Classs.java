// File: Classs.java
public class Classs {

    // Inner class definition
    static class Class {
        String name;
        int age;

        // Constructor
        Class(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method to display information
        void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

    // Main method to test the Class
    public static void main(String[] args) {
        // Creating an object of the inner class
        Class obj = new Class("Alice", 25);
        
        // Displaying object information
        obj.displayInfo();
    }
}
