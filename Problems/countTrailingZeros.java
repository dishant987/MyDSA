public class countTrailingZeros {
    public static void main(String[] args) {
        int n = 87;

        System.out.println("Trailing zeros in " + n + "! = " + count_Trailing_Zeros(n));
    }

    static int count_Trailing_Zeros(int n) {
        int count = 0;
        // divide n by powers of 5
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }
}
