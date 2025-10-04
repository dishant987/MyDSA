import java.util.Arrays;

public class median_of_array {
    public static void main(String[] args) {
        int[] arr = { 56, 67, 30, 79 };
        Arrays.sort(arr);
        float median;
        if (arr.length % 2 == 0) {
            int mid1 = arr[arr.length / 2];
            int mid2 = arr[(arr.length / 2) - 1];
            median = (float) (mid1 + mid2) / 2;
        } else {
            median = (float) arr[arr.length / 2];
        }

        System.out.println("Median: " + median);
    }
}
