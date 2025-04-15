class Node {
    public int data;
    public Node next = null;

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

    public boolean isEmpty() {
        return head == null ? true : false;
    }

    public void insert(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void insert(int index, int value) {
        Node node = new Node(value);
        if (index == 0) {
            node.next = head;
            head = node;
            if (tail == null) {
                tail = node;
            }
            return;
        }
        Node curr = head;
        int ind = 0;
        while (curr != null && ind < index - 1) {
            curr = curr.next;
            ind++;
        }
        if (curr == null) {
            throw new IndexOutOfBoundsException("Index out of bounds for index " + index);
        }
        node.next = curr.next;
        curr.next = node;
        if (node.next == null) {
            tail = node;
        }
    }

    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        head = tail;
        tail = prev;

    }

    public void deleteFirst() {
        Node curr = head;
        if (head == null) {
            throw new IllegalStateException("No value in linked list");
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
        curr.next = null;
    }

    public void deleteEnd() {
        if (head == null) {
            throw new IllegalStateException("No value in linked list");
        }
        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        tail = curr;
        curr.next = null;
    }

    public int size() {
        if (head == null) {
            return 0;
        }
        if (head.next == null) {
            return 1;
        }
        Node curr = head;
        int index = 0;
        while (curr != null) {
            curr = curr.next;
            index++;
        }

        return index;
    }

    public void RemoveNthNodeFromEnd(int index) {
        if (head == null || index <= 0) {
            throw new IllegalArgumentException("Invalid index");
        }

        int size = size();
        if (index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds for index " + index);
        }

        if (index == size) { // Remove the head node
            deleteFirst();
            return;
        }

        Node curr = head;
        for (int i = 1; i < size - index; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;

        if (curr.next == null) { // Update tail if the last node is removed
            tail = curr;
        }
    }

    public int sum() {
        int num = 0;
        if (head == null) {
            return num;
        }

        Node curr = head;
        while (curr != null) {
            num = num + curr.data;

            curr = curr.next;
        }
        return num;
    }

    public int indexOf(int value) {
        if (head == null) {
            return -1;
        }
        int index = 0;
        Node cur = head;
        while (cur != null) {
            if (cur.data == value) {
                return index;
            }
            index++;
            cur = cur.next;
        }

        return -1;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        head = node;

    }

    public void swapPairs() {
        if (head == null || head.next == null) {
            return;
        }

        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        while (prev.next != null && prev.next.next != null) {
            Node first = prev.next;
            Node second = prev.next.next;

            first.next = second.next;
            second.next = first;
            prev.next = second;

            prev = first;
        }

        head = dummy.next;
    }

    public Node reverseRec(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node rest = reverseRec(head.next);
        Node next = head.next;
        next.next = head;
        head.next = null;
        return rest;
    }

    public void reverseRec() {
        head = reverseRec(head);
    }

    // 45 -> 47 -> 48
    @Override
    public String toString() {
        if (head == null) {
            return "";
        }
        StringBuffer st = new StringBuffer();
        Node curr = head;
        while (curr.next != null) {
            st.append(curr.data).append(" -> ");
            curr = curr.next;
        }
        st.append(curr.data);
        return st.toString();
    }
}