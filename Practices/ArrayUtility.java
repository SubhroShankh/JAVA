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

    public static int NoOfOccurences(int[] arr , int num) {
    int f = 0;
    int z = 0;
    while (f<arr.length) {
        if (arr[f] == num) {
        z ++;
    }
        f++;
    }
    
    return z;
}

    public static void DisplayArray(int[] myArr) {
        int i = 0;
        while (i<myArr.length) {
            System.out.print(myArr[i] + " ");
            i++;
        }
        System.out.println();
}

public static int[][] input2DArray() {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter number of rows: ");
    int rows = input.nextInt();
    System.out.println("Please enter no of coloumn: ");
    int coloumn = input.nextInt();
    int[][] numArray = new int[rows][coloumn];

    for(int i = 0 ; i < rows ; i++ ) {
        for(int j = 0 ; j < coloumn ; j++){
            System.out.print("please enter the value for row " + (i+1) + " Please enter the value for coloumn " + (j+1) + ":") ;
            numArray[i][j] = input.nextInt();
        }
    }
    return numArray;
}

}
