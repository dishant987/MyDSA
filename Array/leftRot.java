import java.util.Arrays;
import java.util.Scanner;

//left rotation of an array by k elements
public class leftRot {

    static int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

    public static void Simple(int k) {
        for (int i = 0; i < k; i++) {
            int a = arr[0];
            for (int j = 1; j < arr.length; j++) {
                arr[j - 1] = arr[j];
            }

            arr[arr.length - 1] = a;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void Approach2(int k) {
        reverse(0, k - 1);
        reverse(k, arr.length - 1);
        reverse(0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int a, int b) {
        while (a < b) {
            int temp = arr[b];
            arr[b] = arr[a];
            arr[a] = temp;
            a++;
            b--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for rotation : ");
        int n = scanner.nextInt();
        scanner.close();
        int k = n % arr.length;
        // Simple(k);
        Approach2(k);

    }

}
