// Question: Write a program to calculate the sum of the first N natural numbers.

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        System.out.println("Sum of first " + N + " natural numbers is: " + sum);

        scanner.close();
    }
}
