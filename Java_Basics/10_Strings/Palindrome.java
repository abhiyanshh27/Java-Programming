public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        String reversed = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        
        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}

// Explanation:
// Yeh file String se related ek basic problem ko solve karegi, jaise Palindrome check karna.Yeh file String se related ek basic problem ko solve karegi, jaise Palindrome check karna.