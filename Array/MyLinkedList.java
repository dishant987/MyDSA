class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
    }
}

public class MyLinkedList {
    private Node head;
    private Node tail;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    public void insert(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            head = tail = node;
            return;
        }
        tail.next = node;
        tail = node;

    }

    public String toString() {
        StringBuffer sc = new StringBuffer();
        Node cur = head;
        while (cur != null) {
            sc.append(cur.data);
            if (cur.next != null) {
                sc.append(" -> ");
            }
            cur = cur.next;
        }
        return sc.toString();
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
        Node cur = head;

        int index = 1;
        while (cur.next != null) {
            index++;
            cur = cur.next;
        }
        return index;

    }

    public int sumAll() {

        Node curr = head;
        int sum = 0;
        while (curr.next != null) {
            sum += curr.data;
            curr = curr.next;
        }
        return sum;
    }

    public int findIndexByValue(int value) {
        int index = 0;
        Node curr = head;
        while (curr.next != null) {
            if (curr.data == value) {
                return index;
            }
            curr = curr.next;
            index++;
        }

        return -1;
    }

    public void insertFirst(int value) {

        Node node = new Node(value);
        if (isEmpty()) {
            head = tail = node;
            return;
        }
        node.next = head;
        head = node;

    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void insertByIndex(int index, int value) {
        if (index < 0) {
            throw new IllegalArgumentException("Index cannot be negative");
        }
        Node node = new Node(value);
        if (index == 0) {
            node.next = head;
            head = node;
            return;
        }

        Node prev = null;
        Node curr = head;

        while (index > 0 && curr != null) {
            prev = curr;
            curr = curr.next;
            index--;
        }

        if (index > 0) {
            throw new IllegalArgumentException("Index is out of bounds");
        }
        prev.next = node;
        node.next = curr;
    }

    public void deleteFirst() {
        if (isEmpty()) {
            return;

        }
        Node temp = head;
        head = head.next;
        temp.next = null;
    }

    public void deleteLast() {
        if (isEmpty()) {
            return;
        }

    }

    public void reverse() {
        Node node = tail;
        while (node.data == head.data) {
            System.out.println(node.data + " ");

        }
    }

}