// Q3_LogicalCheck.java
// Check logical conditions using boolean values

public class Q3_LogicalCheck {
    public static void main(String[] args) {
        boolean isAdult = true;
        boolean hasLicense = false;

        if (isAdult && hasLicense) {
            System.out.println("You can drive.");
        } else {
            System.out.println("You cannot drive.");
        }
    }
}
