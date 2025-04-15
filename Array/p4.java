/**
 * p4
 */
public class p4 {

    public static String isPrime(int n) {
        if (n <= 1) {
            return "No";
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return "No"; // If divisible by any number other than 1 and itself, not prime
            }
        }

        return "Yes";
    }

    public static void main(String[] args) {
        System.out.println(isPrime(57));
    }
}