public class Concept_Explanation {

    // 🔁 Recursive function to print numbers from 1 to n
    static void printNumbers(int n) {
        if (n == 0) return; // 🛑 Base case
        printNumbers(n - 1); // 🌀 Recursive call
        System.out.print(n + " ");
    }

    // 📚 What is Recursion?Question2_PowerCalculation
    /*
        Recursion is a process in which a function calls itself directly or indirectly.
        Every recursive function must have:
        1. Base Case: Condition to stop recursion
        2. Recursive Case: Where function calls itself
    */

    // ⚠️ Why recursion can be risky?
    /*
        - Recursion uses stack memory for every function call.
        - If base case is not defined or never reached → StackOverflowError
    */

    // 🧠 Example: Factorial using recursion
    static int factorial(int n) {
        if (n == 0) return 1; // Base case
        return n * factorial(n - 1); // Recursive case
    }

    // 🧠 Example: Fibonacci using recursion
    static int fibonacci(int n) {
        if (n <= 1) return n; // Base cases: fib(0)=0, fib(1)=1
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }

    public static void main(String[] args) {
        System.out.println("📌 Recursion Example: Print 1 to 5");
        printNumbers(5); // Output: 1 2 3 4 5

        System.out.println("\n\n📌 Factorial of 5: " + factorial(5)); // Output: 120

        System.out.println("\n📌 6th Fibonacci number: " + fibonacci(6)); // Output: 8
    }
}
