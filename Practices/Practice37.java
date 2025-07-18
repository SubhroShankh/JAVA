public class Practice37 {
    public static void main(String[] args) {
        System.out.println("Welcome to Maximum and minimum finding programme.\n");

        int[] myArr = ArrayUtility.InputArray();
        int max = Max(myArr);
        int min = Min(myArr);
        System.out.println("your Maximum number is: " + max);
        System.out.println("your Minimum number is: " + min);
    }

    public static int Max(int[] arr ) {
        int i = 0;
        int max = 0;
        while (i<arr.length) {
            if (max < arr[i]) {
                max = arr[i];
            }
            
            i++;
        }
        return max;
    }

    public static int Min(int[] arr ) {
        int  i = 0;
        int min = Max(arr);
        while (i<arr.length) {
            if (min>arr[i]) {
                min = arr[i];
            }
            i++;
        }
        return min;
    } 

}
