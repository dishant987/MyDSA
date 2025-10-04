import java.util.Arrays;

public class median_of_two_sorted_arrays {
    public static void main(String[] args) {
        int[] arr1 = { 1 };
        int[] arr2 = { 2, 4, 5, 6, 7 };

        int m = arr1.length;
        int n = arr2.length;
        int[] merged = new int[m + n];

        int i = 0, j = 0, k = 0;

        // Merge arrays in sorted order
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements
        while (i < m)
            merged[k++] = arr1[i++];
        while (j < n)
            merged[k++] = arr2[j++];

        // Find median
        float median;
        int len = merged.length;
        if (len % 2 == 0) {
            median = (merged[len / 2 - 1] + merged[len / 2]) / 2.0f;
        } else {
            median = merged[len / 2];
        }

        System.out.println("Median: " + median);
    }
}
