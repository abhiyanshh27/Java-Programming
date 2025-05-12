public class ManipulatingStrings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        
        // Concatenation
        String result = str1.concat(" " + str2);
        System.out.println("Concatenated String: " + result);
        
        // Changing case
        System.out.println("Lowercase: " + result.toLowerCase());
        System.out.println("Uppercase: " + result.toUpperCase());
    }
}

// Explanation:
// Yeh file String ko manipulate karne ke liye functions cover karegi, jaise toLowerCase(), toUpperCase(), concat(), etc.