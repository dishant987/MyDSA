import java.util.Arrays;

public class twod {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int target = 6;
        int[] ind = findIndex(arr, target);
        System.out.println(Arrays.toString(ind));

    }

    static int[] findIndex(int[][] arr, int target) {
        int r = 0;
        int c = arr.length-1;

        while (r < arr.length && c >= 0) {

            if (arr[r][c] == target) {
                return new int[] { r, c };
            } else if (arr[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[] { -1, -1 };
    }
}
