public class Practice40 {
    public static void main(String[] args) {
        System.out.println("Welcome to reverse an Array Programme.\n");

        int[] myArr = ArrayUtility.InputArray();
        reverse(myArr);
        System.out.println("Your reverse Array is: ");
        ArrayUtility.DisplayArray(myArr);
    }

    public static void reverse(int[] arr) {
        int i = 0;
        while (i < arr.length/2) {
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = swap;
            i++;
        }
    }
}
