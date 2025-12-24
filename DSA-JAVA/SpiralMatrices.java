public class SpiralMatrices {
    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }

        };
        printSpiral(matrix);
    }

    public static void printSpiral(int matrix[][]) {
        int startRow = 0, endRow = matrix.length - 1, startColumn = 0, endColumn = matrix.length - 1;
        while (startColumn <= endColumn && startRow <= endRow) {

            // Top
            for (int j = startColumn; j <= endColumn; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // Right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][startColumn] + " ");
            }

            // Bottom
            for (int j = endColumn; j >= startColumn; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // Left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startColumn == endColumn) {
                    break;
                }
                System.out.print(matrix[i][startColumn] + " ");

            }

            startColumn++;
            startRow++;
            endColumn--;
            endRow--;

        }
        System.out.println();

    }
}
