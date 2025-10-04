// Best Time to Buy and Sell Stock II

public class p16 {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        int profit = 0;

        int i = 0;
        int j = 1;
        while (i < arr.length - 1 && j < arr.length) {
            if (arr[j] > arr[i]) {
                profit = profit + (arr[j] - arr[i]);
            }
            i++;
            j++;
        }
        System.out.println(profit);

    }
}
