import java.util.Scanner;

public class PairsInArray {
    public static void main(String[] args) {
        int myArr[] = InputArray();
        PrintPairs(myArr);
        // NO.Of Pairs in an array: [n(n-1)/2] =>where n: NoOf elements in an array.
    }

    public static void PrintPairs(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + ", " + arr[j] + ")");
            }
            System.out.println();
        }
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
}
