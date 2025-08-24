class PrintEvenNumbers {
    public static void main(String[] args) {
        int[] myArray = ArrayUtility.InputArray();
        
        for(int num: myArray){
            if (num%2 != 0) {
                continue;
            }
            System.out.println("Your even numbers are: " +num);
            
            
        }
        
    }
}