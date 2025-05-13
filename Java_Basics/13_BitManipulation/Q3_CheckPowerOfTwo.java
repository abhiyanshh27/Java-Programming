import java.util.Scanner;

public class Q3_CheckPowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        // A number is power of 2 if n & (n-1) == 0 and n != 0
        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println(n + " is a Power of 2.");
        } else {
            System.out.println(n + " is NOT a Power of 2.");
        }
        sc.close();
    }
}
