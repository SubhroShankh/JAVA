import java.util.Scanner;

public class Practice43 {
    public static void main(String[] args) {
        System.out.println("Welcome to search element in 2D Array.\n");

        int[][] arr = ArrayUtility.input2DArray();
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number which you want to find: ");
        int num = input.nextInt();
        boolean isFound = isFound(arr , num);
        if (isFound) {
            System.out.println("your given number is present in the Array.");
        } else {
            System.out.println("your given number was missiing in the Array.");
        }

    }

    public static boolean isFound(int[][] arr , int num1){
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr.length ; j++){
                if (num1 == arr[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
