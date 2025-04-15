import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cyclesort {
    public static void main(String[] args) {
        int arr[] = {3,3,3,3,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        List<Integer> a = new ArrayList();
        
        int j=0;
        while (j<arr.length) {
            if(arr[j] != j+1){
                a.add(arr[j]);
            }
            j++;
        }
        System.out.println(a);
    }

    static void sort(int arr[]){
        int i = 0;
        while (i<arr.length) {
            int correct = arr[i]-1;
            if(arr[i] != arr[correct] ){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
    }

    static void swap(int arr[] , int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
