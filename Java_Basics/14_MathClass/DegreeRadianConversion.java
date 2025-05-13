public class DegreeRadianConversion {
    public static void main(String[] args) {
        double radian = Math.toRadians(45); // Convert 45 degrees to radians
        double degree = Math.toDegrees(Math.PI / 4); // Convert π/4 radians to degrees

        System.out.println("45 degrees in radians: " + radian); // 0.7853981633974483
        System.out.println("π/4 radians in degrees: " + degree); // 45.0
    }
}
