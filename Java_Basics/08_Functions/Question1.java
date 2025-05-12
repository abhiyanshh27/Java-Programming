// Function to print even numbers up to n
import java.util.Scanner;

public class Question1 {
    static void printEven(int n) {
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printEven(n);
        sc.close();
    }
}
