public class RecursionAdv {
    // Binary strings problem
    public static void printBinaryStrings(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // if (lastPlace == 0) {
        // printBinaryStrings(n-1, 0, str+"0");
        // printBinaryStrings(n-1, 1, str+"1");
        // }else{
        // printBinaryStrings(n-1, 0, str+"0");
        // }
        printBinaryStrings(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinaryStrings(n - 1, 1, str + "1");
        }
    }

    // ------------------------------------------------------------------------------------------

    // Remove duplicates in a string
    // public static void removeDuplicates(String str, int idx, StringBuilder
    // newStr, boolean map[]) {
    // if (idx == str.length()) {
    // System.out.println(newStr);
    // return;
    // }
    // char currChar = str.charAt(idx);
    // if (map[currChar - 'a'] == true) {
    // removeDuplicates(str, idx + 1, newStr, map);
    // } else {
    // map[currChar - 'a'] = true;
    // removeDuplicates(str, idx + 1, newStr.append(currChar), map);
    // }
    // }

    // ----------------------------------------------------------------------------------------------------------

    // Tiling problem
    // public static int tilingProb(int n) {// (2xn) =>floor size
    // if (n == 0 || n == 1) {
    // return 1;
    // }
    // int vertTile = tilingProb(n - 1);
    // int horiTile = tilingProb(n - 2);
    // int tile = vertTile + horiTile;
    // return tile;
    // }

    // -------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        // System.out.println(tilingProb(5));
        // String str = "appnnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        printBinaryStrings(3, 0, "");
    }
}
