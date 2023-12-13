package list;

import java.util.Iterator;

public class DoublyLinkedListCycleSentinel implements Iterable<Integer> {
    private static class Node {
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
    private Node sentinel = new Node(null, -1, null);

    public DoublyLinkedListCycleSentinel() {
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
    }

    public void addFirst(int value) {
        Node a = sentinel;
        Node b = sentinel.next;
        Node added = new Node(a, value, b);
        a.next = added;
        b.prev = added;
    }

    public void addLast(int value) {
        Node a = sentinel.prev;
        Node b = sentinel;
        Node added = new Node(a, value, b);
        a.next = added;
        b.prev = added;
    }

    private IllegalArgumentException illegalIndex(int index) {
        return new IllegalArgumentException(String.format("index [%d] is illegal%n", index));
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            //Pointer: a non-sentinel node
            Node p = sentinel.next;

            @Override
            public boolean hasNext() {
                return p != sentinel;
            }

            @Override
            public Integer next() {
                int value = p.value;
                p = p.next;
                return value;
            }
        };
    }
}
