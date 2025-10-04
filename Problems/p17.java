// Two sum -Pairs with 0 Sum
/*
 * Given an integer array arr, return all the unique pairs [arr[i], arr[j]] such that i != j and arr[i] + arr[j] == 0.
 * Note: The pairs must be returned in sorted order, the solution array should also be sorted, and the answer must not contain any duplicate pairs.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class p17 {
    public static void main(String[] args) {
        int[] arr = {
                -100, 100, -95, 95, -90, 90, -85, 85, -80, 80,
                -75, 75, -70, 70, -65, 65, -60, 60, -55, 55,
                -50, 50, -45, 45, -40, 40, -35, 35, -30, 30,
                -25, 25, -20, 20, -15, 15, -10, 10, -5, 5,
                0, 0, -1, 1, -2, 2, -3, 3, -4, 4,
                -6, 6, -7, 7, -8, 8, -9, 9, -11, 11,
                -12, 12, -13, 13, -14, 14, -16, 16, -17, 17,
                -18, 18, -19, 19
        };
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 0) {
                    if (!map.containsKey(arr[i]) && !map.containsKey(arr[j])) {
                        map.put(arr[i], new int[] { arr[i], arr[j] });
                    }
                }
            }
        }

        for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + Arrays.toString(entry.getValue()));
        }
    }
}
