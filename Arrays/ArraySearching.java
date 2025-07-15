import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        int [] myArr = {3,6,8,87,65,4,68,23,9,98,34};
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Searching\n");
        System.out.println("Please enter the number which you want to search: ");
        int num = input.nextInt();
        boolean isFond = isFond(myArr, num);
        if (isFond) {
            System.out.println("Your number was found in the Array.");
        }else{
            System.out.println("Your number was missing in the Array.");
        }

    }

    public static boolean isFond(int[] arr , int num1) {
        int index = 0;
        while (index< arr.length) {
            if(arr[index] == num1){
                return true;
            }
            index++;
        }
        return false;
    }
}
