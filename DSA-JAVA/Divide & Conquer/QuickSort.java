/**
 * Quick Sort is another "Divide and Conquer" algorithm.
 * Unlike Merge Sort which does the heavy lifting during the merge phase,
 * Quick Sort does its heavy lifting during the "partition" phase before
 * dividing.
 * Time Complexity: Average Case O(n log n), Worst Case O(n^2) (when already
 * sorted).
 * Space Complexity: O(1) auxiliary space (in-place sorting).
 */
public class QuickSort {

    // Utility function to print the array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * The main recursive function that drives the sorting.
     * 
     * @param arr The array to be sorted
     * @param si  Starting Index
     * @param ei  Ending Index
     */
    public static void quickSort(int arr[], int si, int ei) {
        // Base Case: If starting index crosses or equals ending index,
        // the sub-array has 1 or 0 elements and is already sorted.
        if (si >= ei) {
            return;
        }

        // Step 1: PARTITION
        // Rearrange the array around a "pivot" element.
        // pIdx is the final, correct sorted index of that pivot element.
        int pIdx = partision(arr, si, ei);

        // Step 2: DIVIDE
        // Recursively sort the elements to the LEFT of the pivot
        quickSort(arr, si, pIdx - 1);

        // Recursively sort the elements to the RIGHT of the pivot
        quickSort(arr, pIdx + 1, ei);
    }

    /**
     * The core logic of Quick Sort. It picks a pivot and places all smaller
     * elements
     * to its left, and all larger elements to its right.
     */
    public static int partision(int arr[], int si, int ei) {
        // Choose the last element as the pivot.
        int pivot = arr[ei];

        // 'i' keeps track of the boundary of elements that are smaller than the pivot.
        // It starts just outside our current working range.
        int i = si - 1;

        // 'j' iterates through the array to evaluate each element against the pivot.
        for (int j = si; j < ei; j++) {
            // If the current element is smaller than or equal to the pivot...
            if (arr[j] <= pivot) {
                i++; // Expand the "smaller elements" boundary

                // Swap the current element (arr[j]) into the "smaller elements" section (at
                // arr[i])
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // After evaluating all elements, place the pivot exactly where it belongs.
        // We move the boundary one last time...
        i++;

        // ...and swap the pivot (currently at arr[ei]) with the first "larger" element
        // (at arr[i]).
        int temp = pivot;
        arr[ei] = arr[i]; // NOTE: We must swap with arr[ei], not the variable 'pivot', to change the
                          // actual array.
        arr[i] = temp;

        // Return the index where the pivot has settled. It is now completely sorted!
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };

        // Call quickSort covering the entire array
        quickSort(arr, 0, arr.length - 1);

        printArr(arr); // Expected Output: 2 3 5 6 8 9
    }
}