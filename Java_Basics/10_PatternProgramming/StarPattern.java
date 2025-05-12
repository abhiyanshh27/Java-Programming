import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


// Concept: Pattern Programming in Java
// Pattern programming is useful for:
// Building logic and nested loops understanding
// Improving problem-solving skills
// Developing control over loops and conditions

// Important Concepts:
// Nested Loops: One loop inside another
// Rows and Columns logic
// Spaces and Stars alignment
// Numbers or Alphabets in patterns
// Right angle, pyramid, inverted, diamond shapes