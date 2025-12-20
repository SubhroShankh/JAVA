import java.util.Scanner;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int testArr[] = InputArray();
        printMaxSubArraySumBruteForce(testArr);
        printMaxSubArraySumPrefix(testArr);
        printMaxSubArraySumKadane(testArr);
    }

    public static void printMaxSubArraySumKadane(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("The maximum sum is: " + maxSum);
    }

    public static void printMaxSubArraySumPrefix(int arr[]) {
        int prefix[] = new int[arr.length];

        int max = Integer.MIN_VALUE;
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
                if (max < sum) {
                    max = sum;
                }
            }
        }
        System.out.println("The maximum sum is: " + max);
    }

    public static void printMaxSubArraySumBruteForce(int arr[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                    if (k < j) {
                        System.out.print(", ");
                    }
                    sum += arr[k];
                }
                System.out.print("]");
                System.out.println();
                if (max < sum) {
                    max = sum;
                }
            }
        }
        System.out.println("The maximum sum is: " + max);
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
