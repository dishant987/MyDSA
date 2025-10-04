// Chocolate Distribution problem

import java.util.Arrays;

public class chocolate_distribution_problem {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 1, 9, 56 };
        int m = 5;
        if (m > arr.length) {
            System.out.println("Not possible");
            return;
        }
        Arrays.sort(arr);
        int i = 1;
        int j = m;
        int minDiff = arr[m - 1] - arr[0]; // initial window
        while (j < arr.length) {
            minDiff = Math.min(arr[j] - arr[i], minDiff);
            i++;
            j++;
        }
        System.out.println("Minimum difference: " + minDiff);
    }
}
