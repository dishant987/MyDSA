// Kadane's Algorithm (Maximum Subarray)

public class p12 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, -8, 7, -1, 2, 3 };
        int val = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            val = Math.max(sum, val);
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(sum);
    }
}
