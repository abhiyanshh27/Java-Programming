// Take name and college name as input and print a formatted message
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String college = sc.nextLine();
        System.out.printf("Hi %s, welcome to %s!\n", name, college);
        sc.close();
    }
}
