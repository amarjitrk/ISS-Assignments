// Inheritance, Overriding, Polymorphism, Abstraction, Encapsulation, Interfaces, Packages
// Interface representing a Learnable entity
interface Learnable {
    void learn();
}

// Abstract class representing a Person
abstract class Person {
    String name;

    // Abstract method for displaying information
    abstract void displayInfo();
}

// Derived class (inherits from Person) implementing Learnable interface
class Student extends Person implements Learnable {
	public Student() {
	    // constructor logic here
	}

    @Override
    void displayInfo() {
        System.out.println("Student Name: " + name);
    }

    @Override
    public void learn() {
        System.out.println(name + " is learning.");
    }
}

// Main class to demonstrate inheritance and interfaces
public class InterfaceExample {
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student();
        student.name = "Amarjit";

        // Calling methods
        student.displayInfo();
        student.learn();
    }
}
