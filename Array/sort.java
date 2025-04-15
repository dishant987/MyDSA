import java.util.Arrays;

/**
 * sort
 */
public class sort {

    static void bubblesort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    static void selectionsort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxind = getmax(arr, 0, last);

            int temp = arr[last];
            arr[last] = arr[maxind];
            arr[maxind] = temp;
        }
    }

    static int getmax(int arr[], int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }

        return max;
    }

    static void inserstionsort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else{
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        int a[] = { 8, 4, 9, 2, 1 };

        // bubblesort(a);
        // selectionsort(a);
        inserstionsort(a);

        System.out.println(Arrays.toString(a));

    }
}