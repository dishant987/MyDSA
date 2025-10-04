// Minimise the maximum difference between heights [V.IMP]

public class p9 {
    public static void main(String[] args) {
        int[] arr = { 10, 1, 2, 7, 1, 3 };
        int k = 2;
        int small = arr[0] + k;
        int large = arr[arr.length - 1] - k;
        int ans = arr[arr.length - 1] - arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            int min = Math.min(small, arr[i + 1] - k);
            int max = Math.max(large, arr[i] + k);

            if (min < 0)
                continue;

            ans = Math.min(ans, max - min);
        }

        System.out.println(ans);
    }
}
