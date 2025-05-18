public class MathFunctions {
    public static void main(String[] args) {
        double a = 16.0;
        double b = -25.5;
        double c = 3.0;
        double d = 4.0;

        System.out.println("Square root of a: " + Math.sqrt(a));      // 4.0 (Returns the absolute (positive) value of a number)
        System.out.println("Absolute value of b: " + Math.abs(b));    // 25.5
        System.out.println("Power c^d: " + Math.pow(c, d));           // 81.0 (Returns the result of x^y (x raised to the power y).)
        System.out.println("Max of c and d: " + Math.max(c, d));      // 4.0
        System.out.println("Min of c and d: " + Math.min(c, d));      // 3.0
        System.out.println("Round b: " + Math.round(b));              // -26 (round: Nearest int)
        System.out.println("Ceil of b: " + Math.ceil(b));             // -25.0 (ceil: Smallest int ≥ x)
        System.out.println("Floor of b: " + Math.floor(b));           // -26.0 (floor: Largest int ≤ x)
        System.out.println("Random number: " + Math.random());        // 0.0 to <1.0
    }
}
