public class IsPrime {
    public static void main(String[] args) {
        System.out.println(IsPrime(6));
    }

    public static boolean IsPrime(int num) {
        boolean IsPrime = true;
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                IsPrime = false;
                break;
            }
        }
        return IsPrime;
    }
}
