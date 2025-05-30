import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Leader {
    public static void main(String[] args) {
        int[] arr = { 10, 22, 12, 3, 0, 6 };
        ArrayList<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
        boolean leader = true;
        for (int j = i+1; j < arr.length; j++) {
        if(arr[j]>arr[i]){
        leader = false;
        break;
        }
        }
        if(leader){
        l1.add(arr[i]);
        }
        }
        System.out.println(l1);

        // approach 2
        // l1.add(arr[arr.length - 1]);
        // int max = arr[arr.length - 1];
        // for (int i = arr.length - 2; i >= 0; i--) {
        //     if (arr[i] > max) {
        //         max = arr[i];
        //         l1.add(arr[i]);
        //     }
        // }
        // Collections.sort(l1,Collections.reverseOrder());
        // System.out.println(l1);
    }
}
