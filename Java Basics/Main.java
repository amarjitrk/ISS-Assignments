// Basics of Java: Class, Object, State, and Methods
// Class representing a Student
class Student {
    // Instance variables (state)
    private String stuName;
    private int age;

    // Parameterized constructor to initialize the state
    public Student(String name, int age) {
        this.stuName = name; //this keyword is used to access instance variables
        this.age = age;
    }

    // Method to display student details
    public void display() {
        System.out.println("Student Name: " + stuName);
        System.out.println("Age: " + age);
    }
}

// Main class to demonstrate object creation and method invocation
public class Main {
    public static void main(String[] args) {
        // Creating a Student object
        Student student1 = new Student("Amarjit Dey", 21);

        // Calling the displayDetails method
        student1.display();
    }
}
