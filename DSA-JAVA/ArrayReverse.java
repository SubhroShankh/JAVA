public class ArrayReverse {

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10, 12, 14 };
        reverse(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void reverse(int numbers[]) {
        int first = 0, end = numbers.length - 1;
        while (first < end) {
            int temp = numbers[end];
            numbers[end] = numbers[first];
            numbers[first] = temp;

            first++;
            end--;
        }

    }
}