import java.util.Scanner;

public class Practice45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to sum of Diagonal elements of an Array.\n");
        int[][] myArray = ArrayUtility.input2DArray();
        if (myArray.length == myArray[0].length) {
            int a = sumArray(myArray);
            System.out.print("The sum of Diagonal elements are: " + a);
        } else {
            System.out.println("Your enterd data isn't a square matrix. try again!\n");
            myArray = ArrayUtility.input2DArray();
        }
    }


    public static int sumArray(int[][] sum){
        int suum = 0 ;
        for(int i = 0 ; i < sum.length ; i++){
            for(int j = 0 ; j <sum.length ; j++){
                if (i == j) {
                    suum += sum[i][j];
                } if (sum.length == (i+j)) {
                    suum += sum[i][j];
                }if (sum.length%2 == 0 ) {
                    return suum;
                } else {
                    int a = sum.length/2;
                    suum -= sum[a][a];
                }
            }
        }
        return suum;
    }

}
