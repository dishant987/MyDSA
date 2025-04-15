import java.util.Arrays;

class reverseArray {

    static void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
    
    static void reverseArr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] a = { 2, 3, 6, 2, 12, 79, 3, 1 };
        reverseArr(a);
        System.out.println(Arrays.toString(a));
    }

}