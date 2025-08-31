import java.util.Arrays;

public class Leader {

    public static void main(String[] args) {

        // set 0 in end
        int[] arr = {21, 0, 0, 22, 23};
        int i = 0;
        int j = arr.length - 1;
          while (i < j) {
            if (arr[i] == 0 && arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else if (arr[i] == 0 && arr[j] == 0) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}