// Find maximum sum of subarray of size k.(Sliding Window)

public class p23 {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 7, 8, 1, 2, 8, 1, 0 };
        int k = 3;
        int n= arr.length;
        int maxArr = 0;
        for (int i = 0; i < k; i++) {
            maxArr += arr[i];
        }

        int maxSum = maxArr;

        for (int i = k; i < n; i++) {
            maxArr += arr[i] - arr[i-k];
            maxSum = Math.max(maxArr, maxSum);
        }
        System.out.println(maxSum);
    }
}
