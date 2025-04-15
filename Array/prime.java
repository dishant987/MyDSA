public class prime {

    public static void main(String[] args) {
        int a = 1;
        int b = 10;

        for (int i = a; i <= b; i++) {
            if (i == 1) {
                continue; // Skip 1 as it's not a prime number
            }

            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false; // Not a prime number
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i); // Print the prime number
            }
        }
    }
}
