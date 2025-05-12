import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner object

        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // Read String

        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // Read Integer

        System.out.println("Hello " + name + ", you are " + age + " years old.");
        sc.close();
    }
}
