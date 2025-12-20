public class DecimalToBinary {
    public static void main(String[] args) {
        DecimalToBinary(12);
    }

    public static void DecimalToBinary(int Decimal) {
        int pow = 0;
        int Binary = 0;
        while (Decimal > 0) {
            Binary = Binary + (Decimal % 2) * (int) Math.pow(10, pow);
            Decimal = Decimal / 2;
            pow++;
        }
        System.out.println(Binary);
    }
}