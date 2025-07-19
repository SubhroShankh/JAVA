import java.util.Scanner;

public class Practice39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array deleting programme.\n");

        int[] myArr = ArrayUtility.InputArray();
        System.out.print("Please enter the number which you want to delete: ");
        int del = input.nextInt();

        int[] a = DeletingNum(myArr, del);
        System.out.print("Heres your new array: ");
        ArrayUtility.DisplayArray(a);


    }

    public static int[] DeletingNum(int[] arr , int num1) {
    int acc = ArrayUtility.NoOfOccurences(arr, num1);
    if (acc == 0) {
        return arr;
    }

    int newSize = arr.length - acc;
    int[] newArr = new int[newSize];

    int i = 0, j = 0;
    while (i < arr.length) {
        if (arr[i] != num1) {
            newArr[j] = arr[i];
            j++;
        }
        i++;
    }

    return newArr; 
}

}
