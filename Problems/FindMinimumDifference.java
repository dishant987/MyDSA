// Q6. Find Minimum Difference in a Sorted array.

public class FindMinimumDifference {
    public static void main(String[] args) {
        int[] arr = { 3, 8, 15, 17, 20 };

        int diff = arr[1] - arr[0];
        for (int i = 2; i < arr.length - 1; i++) {
            diff = Math.min(diff, arr[i + 1] - arr[i]);
        }
        System.out.println(diff);
    }
}
