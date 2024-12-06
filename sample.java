public class Factorial {
    // Recursive method to find factorial
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case: 0! is 1
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }

    public static void main(String[] args) {
        int number = 5; // Change this value to calculate the factorial of another number
        int result = factorial(number);
        System.out.println("The factorial of " + number + " is " + result);
    }
}

