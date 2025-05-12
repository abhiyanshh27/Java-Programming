public class ArrayIntro {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 90;
        marks[1] = 80;
        marks[2] = 85;
        marks[3] = 70;
        marks[4] = 95;

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
    }
}

