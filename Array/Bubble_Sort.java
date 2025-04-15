import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] a = { 64, 25, 12, 22, 11 };
        Sort(a);
        System.out.println(Arrays.toString(a));
    }

    static void Sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
