// Find whether an array is a subset of another array

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class p25 {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 23, 19 };
        int[] arr2 = { 19, 5, 3 };

        Set<Integer> s1 = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        boolean a = true;
        for (int i : arr2) {
            if (!s1.contains(i)) {
                a = false;
                break; // stop early if any element is missing
            }
        }
        System.out.println(a);
    }
}
