import java.util.Scanner;

public class RainwaterTrapping {
    public static void main(String[] args) {
        int myArr[] = InputArray();
        System.out.println("Trapped water from the given Array/Graph: " + RainwaterTrapped(myArr));
    }

    public static int[] InputArray() {
        System.out.print("how many elements do you want to enter: ");
        Scanner input = new Scanner(System.in);
        int NoOf = input.nextInt();
        System.out.println();
        int[] Arr = new int[NoOf];
        for (int i = 0; i < NoOf; i++) {
            System.out.print("Enter a number: ");
            Arr[i] = input.nextInt();
        }

        return Arr;
    }

    public static int RainwaterTrapped(int height[]) {
        // calculate left max boundary -> array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // calculate right max boundary -> array
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // loop
        int trappedWater = 0;
        for (int i = 0; i < height.length; i++) {
            // waterLevel = min(leftMax bound, rightMax bound);
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trappedWater = waterLevel - height[i];
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;

    }

}
