public class BinaryToDecimal {
    public static void main(String[] args) {
        BinaryToDecimal(10111010);
    }

    public static void BinaryToDecimal(int binNum) {
        int pow = 0;
        int dec = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            dec = dec + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println(dec);
    }
}
