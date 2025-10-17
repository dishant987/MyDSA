import java.util.HashMap;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 2, 5, 3, 2 };
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        System.out.println(map);
    }
}
