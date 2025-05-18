import java.util.Scanner;

public class Run_Example_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = sc.nextInt();

        System.out.println("Printing from 1 to n (O(n) Time):");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nTime Complexity: O(n)");
        sc.close();
    }
}
