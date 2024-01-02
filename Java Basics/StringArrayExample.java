// Strings and Arrays
public class StringArrayExample {
    // Method to demonstrate strings and arrays
    public static void main(String[] args) {
        // String manipulation
        String greeting = "Hello";
        String name = "Amarjit";
        String message = greeting + " " + name;
        System.out.println("Greeting Message: " + message);

        // Array demonstration
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array Elements:");
        //using enhanced for loop
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
