import java.util.Scanner;

public class ArrayUtility {
    public static int[] InputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of elements: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while (i<size) {  
            System.out.print("Please enter a value: ");
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }
}
