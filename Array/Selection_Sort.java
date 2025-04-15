import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] a = {64,25,12,22,11};
        selectionSort(a);

        System.out.println(Arrays.toString(a));

    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minVal = arr[i];
            int index = i;
            for (int j = i; j < arr.length; j++) {
                if (minVal > arr[j]) {
                    minVal = arr[j];
                    index = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
}