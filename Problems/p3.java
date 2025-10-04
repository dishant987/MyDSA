// Find the "Kth" max and min element of an array 

import java.util.Arrays;

public class p3 {
    public static void main(String[] args) {
        int[] arr = {
                56, 7, 35, 45, 63, 46, 45, 3,
                12, 89, 23, 77, 5, 99, 34, 67,
                81, 2, 41, 58, 36, 90, 11, 8,
                72, 44, 19, 66, 53, 29, 84, 17,
                39, 60, 28, 94, 50, 21, 38, 73
        };
        int k = 4;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[k-1]);
        System.out.println(arr[arr.length-4]);
    }
}
