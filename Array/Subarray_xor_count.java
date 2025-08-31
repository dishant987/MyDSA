public class Subarray_xor_count {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5};
        int k = 7;
        int i = 0;
        for (int j = 0; j < a.length-1; j++) {
            int xor = a[j];
            for (int j2 = j+1; j2 < a.length; j2++) {
                xor = xor ^ a[j2];
                if(xor==k){
                    i++;
                }
            }
        }
        System.out.println(i);
    }
}