// Take two numbers as input and print their sum
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum: " + (a + b));
        sc.close();
    }
}
