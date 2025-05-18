// Concept (Hinglish):
// Binary search tab use hoti hai jab array sorted ho. Yeh array ko half-half divide karta hai aur har half me target element ko search karta hai. Jab target element milta hai, index return hota hai, otherwise element nahi milta.

// Concept (English):
// Binary Search is used when the array is sorted. It divides the array into halves and searches for the target element in the relevant half. If the target element is found, the index is returned, otherwise, it indicates that the element is not present.

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 7, 8, 9};
        int target = 6;
        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Element not found
    }
}
