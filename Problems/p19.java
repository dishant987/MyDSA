import java.util.Arrays;

// Rearrange the array in alternating positive and negative items with O(1) extra space

public class p19 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -4, -1, 4 };
        int k = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                k++;
                swap(arr, i, k);
            }
        }
        int negInt = 0;
        int posInt = k + 1;
        while (negInt < posInt && posInt < arr.length && arr[negInt] < 0) {
            swap(arr,posInt,negInt);
            negInt = negInt + 2;
            posInt++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int k) {
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }
}
