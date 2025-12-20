public class InvertedStar {
    public static void main(String[] args) {
        int n = 5;
        for (int line = 1; line <= n; line++) {
            // We need fewer stars as the line number increases.
            // Formula: (Total Rows - Current Line Number + 1)
            //
            // Example if n = 5:
            // Line 1: 5 - 1 + 1 = 5 stars (*****)
            // Line 2: 5 - 2 + 1 = 4 stars (****)
            // Line 3: 5 - 3 + 1 = 3 stars (***)
            // ...
            // Line 5: 5 - 5 + 1 = 1 star (*)
            for (int star = 1; star <= n - line + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
