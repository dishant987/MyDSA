import java.util.LinkedList;
import java.util.List;

public class test {

    public static void main(String[] args) {
        MyLinkedList l1 = new MyLinkedList();
        l1.insert(0);
        l1.insert(1);
        l1.insert(2);
        l1.insert(3);
        l1.insert(4);
        l1.insert(5);
        l1.swapPairs();
        System.out.println(l1.size());
        System.out.println(l1);
    }
}