import java.util.Scanner;

public class fibonacci {

    static int fib(int a) {
        int n = 0;
        int b = 1;
        for (int i = 1; i < a; i++) {
            int temp = n;
            n = b;
            b = b + temp;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        System.out.println(fib(a));
        sc.close();

    }
}