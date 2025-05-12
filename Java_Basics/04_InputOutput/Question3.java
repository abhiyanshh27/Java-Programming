// Take marks of 3 subjects and print average marks
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double m3 = sc.nextDouble();
        double avg = (m1 + m2 + m3) / 3;
        System.out.printf("Average: %.2f\n", avg);
        sc.close();
    }
}
