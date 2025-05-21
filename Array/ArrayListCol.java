import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListCol {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        // Fixed-size list: elements can be modified, but the size cannot be changed (no
        // add/remove)

        List<Integer> list2 = List.of(54, 3, 345, 34, 5);
        // Immutable list: neither elements can be modified nor the size changed

        List.of(.34, 345, 345);
        List<Integer> l1 = new ArrayList<>();
        l1.add(34);
        l1.add(36);
        l1.add(312);
        l1.add(317);
        l1.add(2);
        l1.add(1);
       l1.sort((a,b)-> a-a);
       System.out.println(l1);
    }

}
