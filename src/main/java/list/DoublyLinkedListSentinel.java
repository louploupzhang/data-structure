package list;

import java.util.Iterator;

public class DoublyLinkedListSentinel implements Iterable<Integer> {
    static class Node {
        Node prev;
        int value;
        Node next;

        public Node(Node prev, int value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }

    //Sentinel
    private Node head;
    private Node tail;

    public DoublyLinkedListSentinel() {
        head = new Node(null, 666, null);
        tail = new Node(null, 888, null);
        head.next = tail;
        tail.prev = head;
    }

    private Node findNode(int index) {
        int i = -1;
        for (Node p = head; p != tail; p = p.next, i++) {
            if (i == index) {
                return p;
            }
        }
        return null;
    }

    public void addFirst(int value) {

    }

    public void removeFirst() {

    }

    public void addLast(int value) {

    }

    public void removeLast() {

    }

    public void insert(int index, int value) {
        Node prev = findNode(index - 1);
        if(prev==null){
            throw illegalIndex(index);
        }
        Node next = prev.next;
        Node inserted = new Node(prev, value, next);
        prev.next = inserted;
        next.prev = inserted;
    }

    public void remove(int index) {

    }

    private IllegalArgumentException illegalIndex(int index) {
        return new IllegalArgumentException(
                String.format("index [%d] is illegal%n", index));
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}
