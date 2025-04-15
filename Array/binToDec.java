public class binToDec {
    public static void main(String[] args) {
        if(n==0) return 1;
        int num = n;
        int mask = 0;
        while(num!=0){
            mask = mask <<1 | 1;
            num = num >> 1
        }

        return  (~n) & mask
    }
}
