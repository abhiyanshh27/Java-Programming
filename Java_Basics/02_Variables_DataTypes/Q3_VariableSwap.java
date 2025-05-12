// Q3_VariableSwap.java
// Swap two variables using a third variable

public class Q3_VariableSwap {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        int temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}

