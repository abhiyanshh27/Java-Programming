// Concept (Hinglish):
// Linear search ek simple searching technique hai, jisme hum array ke elements ko ek ke baad ek check karte hain. Agar target element milta hai toh uska index return karte hain, agar nahi milta toh -1 return hota hai.

// Concept (English):
// Linear Search is a simple searching technique where we check each element of the array one by one. If the target element is found, we return its index; otherwise, we return -1.


public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 3, 7, 8, 9};
        int target = 3;
        int result = linearSearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Element not found
    }
}
