import java.util.Arrays;
import java.util.stream.IntStream;

public class infin {
    public static void main(String[] args) {

        int[] arr = IntStream.rangeClosed(2, 2002).toArray();
        System.out.println(Arrays.toString(arr));
        int target = 2001;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int temp = end + 1;
            end = end+(end - start +1)*2;
            start = temp;
            // end = temp + 4;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int last) {

        if (arr[start] < arr[last]) {

            while (start <= last) {
                int mid = start + (last - start) / 2;
                if (arr[mid] < target) {
                    start = mid + 1;
                } else if (arr[mid] > target) {
                    last = mid - 1;
                } else {
                    return mid;
                }
            }
        } else {
            while (start <= last) {
                int mid = start + (last - start) / 2;
                if (arr[mid] > target) {
                    start = mid + 1;
                } else if (arr[mid] < target) {
                    last = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
