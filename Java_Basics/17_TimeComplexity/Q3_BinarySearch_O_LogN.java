public class Q3_BinarySearch_O_LogN {
    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};
        int key = 8;
        int index = binarySearch(arr, key);
        if (index != -1)
            System.out.println("Found at index: " + index);
        else
            System.out.println("Not Found");
    }
    // Time Complexity: O(log n)
}
