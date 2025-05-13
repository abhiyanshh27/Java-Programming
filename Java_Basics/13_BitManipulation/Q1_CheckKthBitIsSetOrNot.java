import java.util.Scanner;

public class Q1_CheckKthBitIsSetOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();
        System.out.print("Enter position (k): ");
        int k = sc.nextInt();

        // Check if the kth bit is set
        if ((n & (1 << k)) != 0) {
            System.out.println("Yes, " + k + "th bit is set.");
        } else {
            System.out.println("No, " + k + "th bit is not set.");
        }
        sc.close();
    }
}
