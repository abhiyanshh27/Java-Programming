import java.util.Scanner;

public class MathClassExample {
    public static void main(String[] args) {
        
        // Scanner object for taking input
        Scanner sc = new Scanner(System.in);

        // **1. Circle Area Calculation using Math.PI**
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI * Math.pow(radius, 2); // Math.PI and Math.pow for area formula
        System.out.println("Area of the Circle: " + area);

        // **2. Pythagoras Theorem (Hypotenuse Calculation) using Math.pow and Math.sqrt**
        System.out.print("\nEnter side A of the triangle: ");
        double sideA = sc.nextDouble();
        System.out.print("Enter side B of the triangle: ");
        double sideB = sc.nextDouble();
        double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2)); // Pythagoras Theorem
        System.out.println("Hypotenuse of the triangle: " + hypotenuse);

        // **3. Generate a random number between 1 and 100 using Math.random()**
        int randomNumber = (int)(Math.random() * 100) + 1; // Random number between 1 and 100
        System.out.println("\nRandom number between 1 and 100: " + randomNumber);

        // **4. Rounding a number using Math.round()**
        double numberToRound = 4.6;
        long roundedValue = Math.round(numberToRound); // Rounding to nearest integer
        System.out.println("\nRounded value of " + numberToRound + " is: " + roundedValue);

        // **5. Calculate Ceiling and Floor values using Math.ceil() and Math.floor()**
        double number = 5.7;
        double ceilValue = Math.ceil(number);  // Round up to next integer
        double floorValue = Math.floor(number); // Round down to previous integer
        System.out.println("\nCeiling value of " + number + " is: " + ceilValue);
        System.out.println("Floor value of " + number + " is: " + floorValue);

        sc.close(); // Close the scanner
    }
}


// Output:

// Enter the radius of the circle: 5
// Area of the Circle: 78.53981633974483

// Enter side A of the triangle: 3
// Enter side B of the triangle: 4
// Hypotenuse of the triangle: 5.0

// Random number between 1 and 100: 57

// Rounded value of 4.6 is: 5

// Ceiling value of 5.7 is: 6.0
// Floor value of 5.7 is: 5.0
