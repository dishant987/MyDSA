import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 34, 6, 345, 78, 56, 6, 35, 1, 6, 3 };

        InsertionSortAlgo(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void InsertionSortAlgo(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int key = arr[i];
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
