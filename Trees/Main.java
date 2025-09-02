import java.util.List;

public class Main {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(20);
        bt.insert(10);
        bt.insert(30);
        bt.insert(5);
        bt.insert(11);
        bt.insert(25);
        bt.insert(32);
        System.out.println(bt);
        List<List<Integer>> l1 = bt.levelOrderTraversalList();
        System.out.println(l1);
    }
}