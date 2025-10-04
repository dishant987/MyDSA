// Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo

import java.util.Arrays;

public class p4 {

    public static void main(String[] args) {
        int[] arr = { 2, 0, 1, 2, 1, 0, 2, 1, 0 };
        int i = 0;
        int j = arr.length - 1;
        int k = 0;
        while (j >= k) {
            if (arr[k] == 1) {

                k++;
            } else if (arr[k] == 0) {
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                i++;
                k++;
            } else {
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                j--;

            }
        }

        System.out.println(Arrays.toString(arr));
    }
}