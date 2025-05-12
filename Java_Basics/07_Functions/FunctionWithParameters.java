public class FunctionWithParameters {
    // Function with parameters
    static void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }

    public static void main(String[] args) {
        add(10, 20);  // passing values
        add(5, 7);    // another call
    }
}
