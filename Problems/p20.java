// Find if there is any subarray with sum equal to 0

import java.util.HashSet;
import java.util.Set;

public class p20 {
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6 };
        System.out.println(arrange(arr));
    }

    public static boolean arrange(int[] arr) {
        int n = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            n = n + arr[i];
            if (n == 0 || arr[i] == 0 || set.contains(n)) {
                return true;
            }
            set.add(n);
        }
        return false;
    }
}
