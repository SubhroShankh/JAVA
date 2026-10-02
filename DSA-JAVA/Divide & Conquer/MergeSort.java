/**
 * Merge Sort is a "Divide and Conquer" algorithm.
 * It recursively divides the array in half until each sub-array contains only
 * one element,
 * and then merges those sub-arrays back together in sorted order.
 * Time Complexity: O(n log n) in all cases.
 */
public class MergeSort {

    // Utility function to print the array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * The main recursive function that divides the array.
     * 
     * @param arr The array to be sorted
     * @param si  Starting Index
     * @param ei  Ending Index
     */
    public static void MergeSort(int arr[], int si, int ei) {
        // Base Case: If the starting index is greater than or equal to the ending
        // index,
        // it means the sub-array has 1 or 0 elements, which is inherently sorted.
        if (si >= ei) {
            return;
        }

        // Calculate the middle index.
        // We use si + (ei - si) / 2 instead of (si + ei) / 2 to avoid integer overflow
        // for very large arrays.
        int mid = si + (ei - si) / 2;

        // Step 1: DIVIDE
        // Recursively sort the left half
        MergeSort(arr, si, mid);
        // Recursively sort the right half
        MergeSort(arr, mid + 1, ei);

        // Step 2: CONQUER (Merge the sorted halves)
        merge(arr, si, mid, ei);
    }

    /**
     * The function that merges two sorted halves back together into a single sorted
     * segment.
     */
    public static void merge(int arr[], int si, int mid, int ei) {
        // Create a temporary array to hold the merged elements.
        // The size is (ending index - starting index + 1).
        int temp[] = new int[ei - si + 1];

        int i = si; // Iterator for the left half
        int j = mid + 1; // Iterator for the right half
        int k = 0; // Iterator for the temp array

        // Compare elements from both halves and copy the smaller one into temp.
        // This loop runs as long as BOTH halves still have elements to compare.
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++; // Move left iterator forward
            } else {
                temp[k] = arr[j];
                j++; // Move right iterator forward
            }
            k++; // Always move the temp array iterator forward
        }

        // If the right half ran out of elements first, copy the remaining elements
        // from the left half into the temp array.
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // If the left half ran out of elements first, copy the remaining elements
        // from the right half into the temp array.
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Finally, copy the sorted elements from the temp array back into the
        // original array at their correct positions.
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8, -2, -4 };

        // Call MergeSort covering the entire array from index 0 to the last index
        MergeSort(arr, 0, arr.length - 1);

        printArr(arr); // Expected Output: -4 -2 2 3 5 6 8 9
    }
}