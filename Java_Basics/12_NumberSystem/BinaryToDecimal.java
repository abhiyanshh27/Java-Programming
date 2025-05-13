public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "1101";
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            decimal += (binary.charAt(i) - '0') * Math.pow(2, power++);
        }
        System.out.println("Decimal: " + decimal);
    }
}
