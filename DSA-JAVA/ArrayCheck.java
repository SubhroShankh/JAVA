import java.util.Arrays;
import java.util.Scanner;

public class ArrayCheck {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter how many numbers you want to enter: ");
        int NoOf = input.nextInt();
        int[] myArr = new int[NoOf];

        for (int i = 0; i < NoOf; i++) {
            System.out.println("Please enter a number: ");
            myArr[i] = input.nextInt();
        }

        Arrays.sort(myArr);

        boolean foundDuplicate = false;

        for (int j = 0; j < myArr.length - 1; j++) {
            if (myArr[j] == myArr[j + 1]) {
                System.out.println("Duplicate found: " + myArr[j]);

                foundDuplicate = true;

                break;
            }
        }

        if (foundDuplicate == false) {
            System.out.println("No duplicates were found.");
        }
    }
}