public class Practice38 {
    public static void main(String[] args) {
        System.out.println("Programme for checking if the given input are shorted.\n");

        int[] myArr = ArrayUtility.InputArray();
        
        boolean isInc =  isInc(myArr);
        boolean isDec = isDec(myArr);
        if (isDec || isInc) {
            System.out.println("your given input was shorted.");
        } else {System.out.println("your given input was not shorted.");}
    }

    public static boolean isInc(int[] arr) {
        int i = 1;
        while (i<arr.length) {
            if (arr[i] < arr[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDec(int[] arr) {
        int i = 1;
        while (i<arr.length) {
            if (arr[i-1]<arr[i]) {
                return false;
            } 
            i++;
        }
        return true;
    }

}
