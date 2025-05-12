public class ArrayTypes {
    public static void main(String[] args) {
        int[] oneD = {1, 2, 3, 4, 5};
        int[][] twoD = {
            {1, 2},
            {3, 4},
            {5, 6}
        };

        System.out.println("One-Dimensional Array:");
        for (int i : oneD) {
            System.out.print(i + " ");
        }

        System.out.println("\nTwo-Dimensional Array:");
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}
