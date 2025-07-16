

public class Practice35 {
    public static void main(String[] args) {
        System.out.println("Welcome to sum and average calculating calculator.\n");

        int[] myArr = ArrayUtility.InputArray();
        long sum = sum(myArr);
        long average = average(myArr);
        System.out.println("sum of numbers is: " + sum);
        System.out.println("average of numbers is: " + average);
    }

    public static long sum(int[] sumArray) {
        int sum = 0;
        int i = 0;
        while (i<sumArray.length) {
            sum += sumArray[i];
            i++;
        }

        return sum;
    }

    public static long average(int[] averageArray) {
        long sum = sum(averageArray);
        long average = sum/averageArray.length;
        return average;
    }

}
