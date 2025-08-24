class PositiveSum{
    public static void main(String[] args) {
        System.out.println("Welcome to sum of positive numbers calculator.\n");
        int[] arry = ArrayUtility.InputArray();
        int sum = 0;
        for(int num : arry){
            if (num<0) {
                continue;
            }
            sum += num;
        }
        System.out.println("The sum is: "+sum);
    }
}