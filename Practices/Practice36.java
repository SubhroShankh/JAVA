import java.util.Scanner;

public class Practice36 {
    public static void main(String[] args) {
        System.out.println("Welcome to programme for number of occurences.\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter no of elements youu want to enter: ");
        int element = input.nextInt();
        
        int i = 0;
        int[] arr = new int[element];
        while (i<arr.length) {
            System.out.println("Please enter the number: ");
            arr[i] = input.nextInt();
            i++;
        }

        System.out.print("Now enter the number you want to find: ");
        int num = input.nextInt();
        int NoOfOccurences = NoOfOccurences(arr, num);
        System.out.println("your element was fond " + NoOfOccurences + " times from your given data.");
    }

public static int NoOfOccurences(int[] arr , int num) {
    int f = 0;
    int z = 0;
    while (f<arr.length) {
        if (arr[f] == num) {
        z ++;
    }
        f++;
    }
    
    return z;
}

}
