public class decToBin {
    public static void main(String[] args) {
        int num = 45;
        String bin = "";
        while (num != 0) {
            int temp = num & 1;
            bin = temp + bin;

            num = num >> 1;
        }
        System.out.println(bin);
    }
}
