// Find factorial of a large number

import java.util.Arrays;

public class p21 {
    public static void main(String[] args) {
        int num = factorial(10);
        String str = String.valueOf(num);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0'; // convert char to int
        }
        System.out.println(Arrays.toString(digits));
    }

    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
