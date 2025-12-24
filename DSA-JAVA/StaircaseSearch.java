public class StaircaseSearch {
    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        int key = 33;
        staircaseSearch(matrix, key);

    }

    public static boolean staircaseSearch(int[][] matrices, int key) {
        int row = 0;
        int column = matrices[0].length - 1;
        while (row < matrices.length && column >= 0) {
            if (matrices[row][column] == key) {
                System.out.println("found ket at (" + row + "," + column + ")");
                return true;
            } else if (key < matrices[row][column]) {
                column--;
            } else {
                row++;
            }
        }
        System.out.println("Key not found!");
        return false;
    }
}
