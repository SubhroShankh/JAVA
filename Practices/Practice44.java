

public class Practice44 {
    public static void main(String[] args) {
        System.out.println("Welcome to sum and average of all element of 2D Array.\n");
        int[][] myArray = ArrayUtility.input2DArray();
        int sum = sum(myArray);
        int average = average(myArray);
        System.out.println("your sum value is: " + sum);
        System.out.println("your average value is: " + average);
    }

    public static int sum(int[][] arr){
        int sum = 0;
        for(int i = 0 ; i < arr.length ;i++) {
            for(int j = 0 ; j < arr.length ; j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static int average(int[][] arr){
        if (arr.length == 0) {
            return 0;
        }
        int sum = sum(arr);            
        int rows = arr.length;
        int colmn = arr[0].length;
        return  sum / (rows*colmn);
    }

}
 