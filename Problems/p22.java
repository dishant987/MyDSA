// Longest Consecutive Subsequence

import java.util.Arrays;

public class p22 {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 1, 9, 4, 5, 3 };
        Arrays.sort(arr);
        int max = 0;
        int n = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i + 1] == arr[i]) {
                continue; // skip duplicates
            }
            if (arr[i + 1] - arr[i] == 1) {
                n++;
            } else {
                max = Math.max(max, n);
                n = 0;
            }

        }
        max = Math.max(max, n);
        System.out.println(max + 1);
    }
}
