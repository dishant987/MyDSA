import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        // try to modify the list read and write same time not possible in ArrayList.
        // List<Integer> l1 = new ArrayList<>();
        List<Integer> l1 = new CopyOnWriteArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        for (Integer integer : l1) {
            System.out.println(integer);
            if (integer.equals(2)) {
                l1.add(10);
            }
        }
        System.out.println(l1);

    }
}
