public class NextSmallestLetter {
    public static void main(String[] args) {
        char[] arr = { 'a', 'c', 'f', 'h', 'k', 'm', 'p', 'r', 't', 'x', 'z' };
        char target = 'p';

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {

                end = mid - 1;
            } else {

                start = mid + 1;
            }
        }

        System.out.println(arr[start % arr.length]);
    }
}
