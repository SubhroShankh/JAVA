
public class RecursionBasics {
    // Optimized power
    public static int optPow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPowerSq = optPow(x, n / 2) * optPow(x, n / 2);
        if (n % 2 != 0) {
            return halfPowerSq * x;
        }
        return halfPowerSq;
    }

    // -------------------------------------------------------------------------------------

    // power
    // public static long pow(int x, int n) {
    // if (n == 0) {
    // return 1;
    // }
    // return x * pow(x, n - 1);
    // }

    // --------------------------------------------------------------------------------------

    // last occurence
    // public static int lstOccu(int arr[], int i, int key) {
    // if (i == arr.length) {
    // return -1;
    // }
    // int isFound = lstOccu(arr, i + 1, key);
    // if (isFound == -1 && arr[i] == key) {
    // return i;
    // }
    // return isFound;
    // }

    // -------------------------------------------------------------------------------------------------------

    // first occurence
    // public static int fstOccu(int arr[], int i, int n) {
    // if (i == arr.length) {
    // return -1;
    // }
    // if (arr[i] == n) {
    // return i;
    // }
    // return fstOccu(arr, i + 1, n);
    // }

    // ----------------------------------------------------------------------------------

    // shorted array
    // public static boolean isShorted(int arr[], int i) {
    // if (i == arr.length - 1) {
    // return true;
    // }
    // if (arr[i] > arr[i + 1]) {
    // return false;
    // }
    // return isShorted(arr, i + 1);
    // }

    // -----------------------------------------------------------------------------------------------------------

    // Fibonacci series
    // public static int Fibonacci(int n) {
    // if (n == 0 || n == 1) {
    // return n;
    // }
    // int fnm1 = Fibonacci(n - 1);
    // int fnm2 = Fibonacci(n - 2);
    // int fibo = fnm1 + fnm2;
    // return fibo;
    // }

    // ----------------------------------------------------------------------------------------

    // Sum of first n number
    // public static int sum(int n) {
    // if (n == 0) {
    // return 0;
    // }
    // int sumPrev = sum(n - 1);
    // int sumCurr = n + sumPrev;
    // return sumCurr;
    // }

    // --------------------------------------------------------------------------------------------------------

    // Factorial
    // public static int fact(int n) {
    // if (n == 1 || n == 0) {
    // return 1;
    // }
    // return n * fact(n - 1);
    // }

    // ---------------------------------------------------------------------------------------

    // Recursion increasing order
    // public static void printInc(int n) {
    // if (n == 1) {
    // System.out.println(n);
    // return;
    // }
    // printInc(n - 1);
    // System.out.println(n + " ");
    // }

    // -----------------------------------------------------------------------------

    // Recursion decreasing order
    // public static void printDec(int n) {
    // if (n == 1) {
    // System.out.println(n);
    // return;
    // }
    // System.out.println(n + " ");
    // printDec(n - 1);
    // }

    // ----------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        // printInc(10);
        // System.out.println(fact(5));
        // System.out.println(sum(5));
        // System.out.println(Fibonacci(45));
        // int arr[] = { 1, 2, 3, 4, 5, 9, 5, 8 };
        // // System.out.println(isShorted(arr, 0));
        // System.out.println(lstOccu(arr, 0, 5));

        // System.out.println(pow(2, 2));
        System.out.println(optPow(2, 5));
    }
}
