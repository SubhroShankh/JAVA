public class Practice41 {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Array checking.\n");

        int[] myArr = ArrayUtility.InputArray();
        boolean isPalindrome = isPalindrome(myArr);
        if (isPalindrome) {
            System.out.println("The given Array is Palindrome.");
        }else {
            System.out.println("The given Array is not a Palindrome.");
        }

    }

    public static boolean isPalindrome(int[] arr) {
        if (arr == null || arr.length == 0) return true;
        int i = 0;
        while (i < arr.length/2) {
            if (arr[i] != arr[(arr.length-1) - i]) {
                return false;
            }
            i++;
        }
        return true;
    }

}
