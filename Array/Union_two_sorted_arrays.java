import java.util.ArrayList;

public class Union_two_sorted_arrays {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 2, 3, 4, 4, 5 };

        int i = 0;
        int j = 0;
        ArrayList<Integer> a1 = new ArrayList<>();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                if (a1.isEmpty() || a1.get(a1.size() - 1) != arr1[i]) {
                    a1.add(arr1[i]);
                }
                i++;
                j++;
            } else if (arr1[i] > arr2[j]) {
                if (a1.isEmpty() || a1.get(a1.size() - 1) != arr1[j]) {
                    a1.add(arr1[j]);
                }
                j++;
            } else {
                if (a1.isEmpty() || a1.get(a1.size() - 1) != arr2[i]) {
                    a1.add(arr1[i]);
                }
                i++;
            }
        }

        while (i < arr1.length) {
            if (a1.isEmpty() || a1.get(a1.size() - 1) != arr1[i]) {
                a1.add(arr1[i]);
            }
            i++;
        }
        while (j < arr2.length) {
            if (a1.isEmpty() || a1.get(a1.size() - 1) != arr2[j]) {
                a1.add(arr2[j]);
            }
            j++;
        }
        System.out.println(a1);
    }
}
