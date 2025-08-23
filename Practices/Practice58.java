class MaxArray{
    public static void main(String[] args) {
        System.out.println("Welcome to finding max number.\n");
        int[] myArry = ArrayUtility.InputArray();
        int max = Integer.MIN_VALUE;
        for(int num : myArry){
            if (num>max) {
                max = num;
            }
        }

        System.out.println("Maximum number is :" + max);
    }
}