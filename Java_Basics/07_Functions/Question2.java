// Function to calculate factorial of a number
public class Question2 {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5 is: " + factorial(5));
    }
}
