public class Practice38 {
    public static void main(String[] args) {
        System.out.println("Programme for checking if the given input are shorted.\n");

        int[] myArr = ArrayUtility.InputArray();
        boolean isShort = Short(myArr);
        
        if (isShort) {
            System.out.println("your given input was shorted.");
        } else {System.out.println("your given input was not shorted.");}
    }

    public static boolean Short(int[] arr) {
        int i = 0;
        int z = 1;
        while (i < arr.length) {
            if (arr[i]<arr[z]) {
                return true;
            }
            i++;
            z++;
        }
        return false;
    }

}
