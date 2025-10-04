// Find the Union and Intersection of the two sorted arrays.

import java.util.HashSet;
import java.util.Set;

public class p6 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25 };
        int[] arr2 = { 2, 3, 6, 7, 10, 13, 14, 17, 20, 23, 26, 29, 30 };

        Set<Integer> Intersection = new HashSet<Integer>();
        Set<Integer> Union = new HashSet<Integer>();

        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                Intersection.add(arr1[i]);
                Union.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                Union.add(arr1[i]);
                i++;
            } else {
                Union.add(arr2[j]);
                j++;
            }
        }

        // Add remaining elements from arr1
        while (i < arr1.length) {
            Union.add(arr1[i]);
            i++;
        }
        // Add remaining elements from arr2
        while (j < arr2.length) {
            Union.add(arr2[j]);
            j++;
        }

        System.out.println("Intersection: " + Intersection);
        System.out.println("Union: " + Union);

    }
}
