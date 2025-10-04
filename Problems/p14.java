// Merge Intervals

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p14 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> list = new ArrayList<>();
        int[] curr = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] <= curr[1]) {
                curr[1] = Math.max(arr[i][1], curr[1]);
               
            } else {
                list.add(curr);
                curr = arr[i];
            }
        }
        list.add(curr);
        System.out.println(list.size());
        for (int[] i : list) {
            System.out.println(Arrays.toString(i));
        }

    }
}
