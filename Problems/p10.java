// Minimum no. of Jumps to reach end of an array

public class p10 {
    public static void main(String[] args) {
        int[] arr = { 2,5,0,0 };
        int step = 0;
        int i = 0;

        while (i < arr.length) {
            if (arr[i] == 0 && i != arr.length - 1) {
                step = -1;
                break;
            }
            if (arr.length - 1 == i) {
                break;
            }

            if (i + arr[i] >= arr.length) {
                step++;
                break;
            } else {
                i = i + arr[i];
                step++;
            }
        }
        System.out.println(step);
    }
}
