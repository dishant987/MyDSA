import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {34,6,345,78,56,6,35,1,6,3};
        BubbleSortAlgo(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void BubbleSortAlgo(int[] arr){
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                    swapped = true;
                }
            }
        }
    }
}