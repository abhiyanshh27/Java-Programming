// Concept (Hinglish):
// Exponential search tab use hoti hai jab hum ek sorted array me element find kar rahe hote hain. Pehle, yeh range ko find karta hai, jisme target element ho sakta hai, phir binary search ke through us range ko search karte hain.

// Concept (English):
// Exponential Search is used for searching in a sorted array, especially when the size is unbounded. First, it finds the range in which the target element might be, and then applies binary search within that range.

public class ExponentialSearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 7;
        int result = exponentialSearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int exponentialSearch(int[] arr, int target) {
        if (arr[0] == target) {
            return 0;
        }

        int i = 1;
        while (i < arr.length && arr[i] <= target) {
            i = i * 2;
        }

        return binarySearch(arr, target, i / 2, Math.min(i, arr.length - 1));
    }

    public static int binarySearch(int[] arr, int target, int left, int right) {
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
        return -1;
    }
}
