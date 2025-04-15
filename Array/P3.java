/**
 * P3
 */
public class P3 {

    static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length(); // Count the number of digits

        while (num != 0) {
            int temp = num % 10;
            sum += Math.pow(temp, digits); // Raise to the power of the number of digits
            num /= 10;
        }
        
        return originalNum == sum; // Return true if it matches
    }

    static void printArmstrongNumbers(int a ) {
        for (int i = 1; i < a; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int a = 1534;
        boolean isArmstrongNumber = isArmstrong(a);
        System.out.println(a + " is an Armstrong number: " + isArmstrongNumber);
        printArmstrongNumbers(a);
    }
}
