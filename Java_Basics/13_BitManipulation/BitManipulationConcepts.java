public class BitManipulationConcepts {
    public static void main(String[] args) {
        int a = 5;  // binary: 0101
        int b = 3;  // binary: 0011

        System.out.println("a = " + a + " (" + Integer.toBinaryString(a) + ")");
        System.out.println("b = " + b + " (" + Integer.toBinaryString(b) + ")");
        System.out.println();

        // AND Operator
        System.out.println("a & b = " + (a & b)); // 0101 & 0011 = 0001 => 1

        // OR Operator
        System.out.println("a | b = " + (a | b)); // 0101 | 0011 = 0111 => 7

        // XOR Operator
        System.out.println("a ^ b = " + (a ^ b)); // 0101 ^ 0011 = 0110 => 6

        // NOT Operator (1's complement)
        System.out.println("~a = " + (~a)); // ~0101 => 1010 (2's comp form = -6)

        // Left Shift (<<) — Multiply by 2^n
        int leftShift = a << 1; // 0101 << 1 => 1010 => 10
        System.out.println("a << 1 = " + leftShift);

        // Right Shift (>>) — Divide by 2^n
        int rightShift = a >> 1; // 0101 >> 1 => 0010 => 2
        System.out.println("a >> 1 = " + rightShift);
    }
}

// Output:
// a = 5 (101)
// b = 3 (11)

// a & b = 1
// a | b = 7
// a ^ b = 6
// ~a = -6
// a << 1 = 10
// a >> 1 = 2
