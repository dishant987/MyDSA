public class binary {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 4, 6, 7, 8, 34, 56, 78 };
        int[] arr2 = { 78, 56, 34, 8, 7, 6, 4, 5, 1 };
        int target = 1;
        int target2 = 1;
        int numase = binarySearch(arr, target);
        int numdesc = binarySearch(arr2, target2);
        System.out.println("numase : " + numase);
        System.out.println("numdesc : " + numdesc);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int last = arr.length - 1;
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
