// Move all the negative elements to one side of the array 

import java.util.Arrays;

public class p5 {
    public static void main(String[] args) {
        int[] arr = {
                12, -7, 5, -3, 19, -11, 0, 8, -25, 33,
                -14, 27, -9, 41, -2, 16, -18, 29, -22, 6,
                38, -30, 4, -5, 21, -12, 10, -1, 15, -17
        };

        int j = arr.length - 1;
        int k = 0;
        while (j >= k) {
            if(arr[k] >0){
               int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                j--;
            }else{
                k++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
