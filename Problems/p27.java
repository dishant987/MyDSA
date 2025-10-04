// Trapping Rain water problem ( Prefix & Suffix Max arrays)

public class p27 {
    public static void main(String[] args) {
        int[] arr = { 5, 0, 6, 2, 3, 0, 4, 1, 2, 1, 7, 0, 3, 2, 5, 0, 1, 4 };
        int[] arr1 = new int[arr.length];
        int[] arr2 = new int[arr.length];
        int i = 1;
        int j = arr2.length - 2;
        int MaxArr1 = arr[0];
        arr1[0] = MaxArr1;
        int MaxArr2 = arr[arr.length - 1];
        arr2[arr.length - 1] = MaxArr2;

        while (i <= arr1.length && j >= 0) {
            if (arr[i] > MaxArr1) {
                MaxArr1 = arr[i];
            }

            if (arr[j] > MaxArr2) {
                MaxArr2 = arr[j];
            }
            arr1[i] = MaxArr1;
            arr2[j] = MaxArr2;
            i++;
            j--;
        }
        int maxDif = 0;
        for (int k = 0; k < arr.length; k++) {
            int temp = Math.min(arr1[k], arr2[k]) - arr[k];
            maxDif = temp + maxDif;
        }
        System.out.println(maxDif);
    }
}
