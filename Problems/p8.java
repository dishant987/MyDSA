// find Largest sum contiguous Subarray [V. IMP]

public class p8 {

    public static void main(String[] args) {
        int[] arr = { 2, 3, -8, 7, -1, 2, 3};
        int max = arr[0];
        int currentSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            max = Math.max(max, currentSum);
        }
        System.out.println(max);
    }
}