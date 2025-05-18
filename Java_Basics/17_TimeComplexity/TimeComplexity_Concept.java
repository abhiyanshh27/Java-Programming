public class TimeComplexity_Concept {

    public static void constantTime() {
        System.out.println("This is O(1) - Constant Time");
    }

    public static void linearTime(int n) {
        System.out.println("This is O(n) - Linear Time");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void quadraticTime(int n) {
        System.out.println("This is O(n^2) - Quadratic Time");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        constantTime();
        linearTime(5);
        quadraticTime(3);
    }
}
