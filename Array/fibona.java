public class fibona {

    static int[] fibo(int num) {
        int f = 0;
        int l = 1;
        int n3[] = new int[num];
        n3[0] = f;
        n3[1] = l;
        for (int i = 2; i < num; i++) {
            n3[i] = f + l;
            f = l;
            l = n3[i];
        }
        return n3;
    }

    public static void main(String[] args) {

        int num = 11;
        int f[] = fibo(num);

        for (int i : f) {
            System.out.print(i+" ");
        }

    }
}