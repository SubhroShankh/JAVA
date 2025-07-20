public class Practice42 {
    public static void main(String[] args) {
        System.out.println("Welcome to Double Array shorting Programme.\n");

        int[] firstArr = ArrayUtility.InputArray();
        int[] secArr = ArrayUtility.InputArray();
        int[] mergedArr = shorting(firstArr, secArr);
        System.out.print("Your merged Array is: ");
        ArrayUtility.DisplayArray(mergedArr);
    }

    public static int[] shorting(int[] arr1 , int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length || j< arr2.length ) {
            if ( j == arr2.length || ( i < arr1.length && arr1[i] < arr2[j])) {
                newArr[k] = arr1[i];
                i++;
                k++;  
            }else{
                newArr[k] = arr2[j];
                k++;
                j++;
            }
        }
        
        return newArr;
    }

}
