// Find pivot in bitonic array
public class pivot_In_Bitonic_Array {
    public static void main(String[] args) {
        int[] arr = { 3, 8, 12, 14, 15, 10, 6, 2 };

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(arr[start]);
    }
}
