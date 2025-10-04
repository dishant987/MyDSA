// Reverse the array

import java.util.Arrays;

public class p1 {

    public static void main(String[] args) {
        int[] arr = {56,7,35,45,63,46,45,3};
        int i = 0;
        int j = arr.length -1;
        while (j>=i) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}