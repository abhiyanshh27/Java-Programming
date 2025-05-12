public class FunctionWithReturn {
    // Function returning a value
    static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        int result = square(6);
        System.out.println("Square is: " + result);
    }
}
