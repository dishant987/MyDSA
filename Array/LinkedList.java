public class LinkedList {
    public static void main(String[] args) {
        MyLinkedList m1 = new MyLinkedList();

        m1.insert(56);
       
        System.out.println(m1);
        m1.deleteFirst();
        m1.deleteFirst();
       
        System.out.println(m1);

    }
}
