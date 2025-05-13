import java.util.Scanner;

public class Q2_ToggleKthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Enter position to toggle: ");
        int k = sc.nextInt();

        int result = n ^ (1 << k);
        System.out.println("Result after toggling " + k + "th bit: " + result);
        sc.close();
    }
}
