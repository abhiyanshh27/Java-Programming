public class CheckPowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        boolean isPowerOfTwo = (n & (n - 1)) == 0;
        System.out.println(n + " is power of 2: " + isPowerOfTwo);
    }
}
