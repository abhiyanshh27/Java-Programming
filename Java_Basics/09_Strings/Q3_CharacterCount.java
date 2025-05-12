import java.util.Scanner;

public class Q3_CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int[] count = new int[256]; // ASCII character set
        
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        
        System.out.println("Character count in the string:");
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.println((char)i + ": " + count[i]);
            }
        }
    }
}
