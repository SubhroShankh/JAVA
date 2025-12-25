public class Bit {
    public static void main(String[] args) {
        // System.out.println(5 & 6); // This '&' is bitwise AND operator. It returns 1
        // if both bits are 1 else
        // returns 0
        // System.out.println(5 | 6); // This '|' is bitwise OR operator. It returns 1
        // if any of the bits is 1 else
        // returns 0
        // System.out.println(5 ^ 6); // This '^' is bitwise XOR operator. It returns 1
        // if both bits are different
        // else returns 0
        // System.out.println(~5); // This '~' is bitwise NOT operator. It inverts all
        // the bits where 0 becomes 1
        // and 1 becomes 0
        // System.out.println(5 << 2); // This '<<' is left shift operator. It shifts
        // all bits to left by specified
        // number of positions
        // a << b = a*2^b
        // System.out.println(5 >> 2); // This '>>' is right shift operator. It shifts
        // all bits to right by specified
        // number of positions
        // a >> b = a/2^b

        System.out.println(getIthBit(10, 2));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 2, 1));
        System.out.println(clearIBits(15, 2));
    }

    public static int clearIBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return bitMask & n;
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return bitMask | n;
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((bitMask & n) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
