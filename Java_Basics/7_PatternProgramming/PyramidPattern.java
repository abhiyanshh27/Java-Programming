//     *
//    ***
//   *****
//  *******
// *********



public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the pyramid
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" "); // Print spaces for alignment
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*"); // Print stars
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
