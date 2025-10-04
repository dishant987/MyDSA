// Write a program to cyclically rotate an array by one.

import java.util.Arrays;

public class p7 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int k = 1;
        int mod = k % arr.length;
        rev(0, arr.length-1, arr);
        rev(0, mod-1, arr);
        rev(mod, arr.length-1, arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void rev(int i , int j , int[] arr){
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    
}
