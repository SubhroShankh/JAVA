import java.util.Scanner;

public class SubArrayInArray {
    public static void main(String[] args) {
        int myArr[] = InputArray();
        PrintSubArray(myArr);
    }

    public static int[] InputArray() {
        System.out.print("how many elements do you want to enter: ");
        Scanner input = new Scanner(System.in);
        int NoOf = input.nextInt();
        System.out.println();
        int[] Arr = new int[NoOf];
        for (int i = 0; i < NoOf; i++) {
            System.out.print("Enter a number: ");
            Arr[i] = input.nextInt();
        }

        return Arr;
    }

    public static void PrintSubArray(int arr[]) {
        // NO.Of Pairs sub array in an array: [n(n+1)/2] =>where n: NoOf elements in an
        // array.
        int TotalSubArrays = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                    if (k < j)
                        System.out.print(", ");
                }
                System.out.print("]");
                TotalSubArrays++;
            }
            System.out.println();
        }
        System.out.println("Total sub arrays are: " + TotalSubArrays);
    }

}
