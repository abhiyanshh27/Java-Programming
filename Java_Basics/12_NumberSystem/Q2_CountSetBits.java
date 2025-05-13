import java.util.Scanner;

public class Q2_CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        while (num > 0) {
            count += (num & 1);
            num >>= 1;
        }

        System.out.println("Number of set bits: " + count);
        sc.close();
    }
}
