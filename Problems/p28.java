
public class p28 {

    public static void main(String[] args) {
        int num = 19;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(getMSB(num));
        num = num >> 1;
        System.out.println(num);
    }

    static int getMSB(int n) {
        int msb = 1; // start with 2^0
        while (msb <= n) { // shift until msb exceeds n
            msb <<= 1; // multiply by 2 (shift left)
        }
        return msb >> 1; // go back to the previous power of 2
    }

}