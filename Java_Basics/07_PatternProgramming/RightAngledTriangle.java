// *
// **
// ***
// ****
// *****


public class RightAngledTriangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print stars
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
