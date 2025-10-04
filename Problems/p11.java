// find duplicate in an array of N+1 Integers

import java.util.HashMap;

public class p11 {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 4, 7, 2, 9, 8, 6, 5, 10, 12, 15, 11, 14, 13, 18, 16, 20, 17, 19, 8 };
        HashMap<Integer, Integer> s1 = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (s1.containsKey(arr[i])) {
                System.out.println(s1.get(arr[i]));
                break;
            } else {

                s1.put(arr[i], 1);
            }
        }
    }
}
