// Find the maximum and minimum element in an array

public class p2 {
    public static void main(String[] args) {
        int[] arr = {
                56, 7, 35, 45, 63, 46, 45, 3,
                12, 89, 23, 77, 5, 99, 34, 67,
                81, 2, 41, 58, 36, 90, 11, 8,
                72, 44, 19, 66, 53, 29, 84, 17,
                39, 60, 28, 94, 50, 21, 38, 73
        };

        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min : " + min);
        System.out.println("max : " + max);
    }
}
