import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 34, 6, 345, 78, 56, 6, 35, 1, 6, 3 };
        SelectionSortAlgo(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void SelectionSortAlgo(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int ele = i;
            int ind = i + 1;

            while (ind < arr.length) {
                if (arr[ele] > arr[ind]) {
                    ele = ind;
                }
                ind++;
            }
            int temp = arr[i];
            arr[i] = arr[ele];
            arr[ele] = temp;
        }
    }
}
