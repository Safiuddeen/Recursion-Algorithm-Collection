package recursion_Methods;

public class FabunacciUsing_NonTail_Recursion {

    // Method to calculate the nth Fibonacci number using non-tail recursion
    public static int fibonacci(int n) {
        // Base cases: the first two Fibonacci numbers
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // Recursive case: sum of the previous two Fibonacci numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int number = 12; // Example input
        int result = fibonacci(number); // Calculate the nth Fibonacci number
        System.out.println("Fibonacci number " + number + " is: " + result);
    }
}

