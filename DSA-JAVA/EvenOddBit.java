public class EvenOddBit {
    public static void main(String[] args) {
        int n = 1;
        if (evenOdd(n)) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

    public static boolean evenOdd(int n) {
        if ((n & 1) == 0) {
            return true;
        }
        return false;
    }
}
