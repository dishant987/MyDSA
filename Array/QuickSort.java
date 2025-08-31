import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int index = low - 1;
        int pivert = arr[high - 1];
        for (int i = low; i < arr.length; i++) {
            if (arr[i] < pivert) {
                index++;
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;

            }
        }

        int temp = arr[index + 1];
        arr[index + 1] = pivert;
        arr[high-1] = temp;

        return index + 1;

    }

    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        quickSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}