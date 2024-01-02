// Exception Handling, throw vs throws
public class ExceptionExample {
    // Method that throws an exception
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Not eligible for voting");
        } else {
            System.out.println("Eligible for voting");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (ArithmeticException e) {
            System.out.println("Caught the exception: " + e.getMessage());
        }
    }
}
