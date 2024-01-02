// Basic Datatypes, Variable types, Modifier types, Final keyword, Constructors

//class with public visibility (public access modifier)
public class Calculator {
    // Instance variable
    private final int result; // final variable using private access modifier.

    // Constructor
    public Calculator(int iniVal) {
        this.result = iniVal;
    }

    // Method to perform addition
    public int add(int number) {
        return result + number;
    }

    // Method to perform subtraction
    public int subtract(int number) {
        return result - number;
    }

    // Static method to demonstrate variable types and modifier types
    public static void main(String[] args) {
        final int constVal = 100; // final variable

        // Performing operations using Calculator class
        Calculator calculator = new Calculator(constVal);
        System.out.println("Result after addition: " + calculator.add(20));
        System.out.println("Result after subtraction: " + calculator.subtract(10));
    }
}

