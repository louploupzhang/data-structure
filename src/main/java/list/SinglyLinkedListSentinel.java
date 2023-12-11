package list;

import java.util.Iterator;
import java.util.function.Consumer;

public class SinglyLinkedListSentinel implements Iterable<Integer> {
    private Node head = new Node(666, null); //Sentinel node

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            SinglyLinkedListSentinel.Node p = head.next;

            @Override
            public boolean hasNext() {
                return p != null;
            }

            @Override
            public Integer next() {
                int v = p.value;
                p = p.next;
                return v;
            }
        };
    }

    private static class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void addFirst(int value) {
        insert(0, value);
    }

    public void loop1(Consumer<Integer> consumer) {
        Node p = head.next;
        while (p != null) {
            consumer.accept(p.value);
            p = p.next;
        }
    }

    public void loop2(Consumer<Integer> consumer) {
        for (Node p = head.next; p != null; p = p.next) {
            consumer.accept(p.value);
        }
    }

    private Node findLast() {
        Node p; //If the list is empty: last -> sentinel, so it's not null
        for (p = head; p.next != null; p = p.next) {
        }
        return p;
    }

    public void addLast(int value) {
        Node last = findLast(); //If the list is empty: last -> sentinel, so it's not null
        last.next = new Node(value, null);
    }

    private Node findNode(int index) { //Return the object -> should be private for security use
        int i = -1;
        for (Node p = head; p != null; p = p.next, i++) {
            if (i == index) {
                return p;
            }
        }
        return null;
    }

    public int get(int index) {
        Node node = findNode(index);
        if (node == null) {
            throw illegalIndex(index);
        }
        return node.value;
    }

    private IllegalArgumentException illegalIndex(int index) {
        return new IllegalArgumentException(
                String.format("index [%d] is illegal%n", index));
    }

    public void insert(int index, int value) {
        Node prev = findNode(index - 1);
        if (prev == null) {
            throw illegalIndex(index);
        }
        prev.next = new Node(value, prev.next);
    }

    public void removeFirst() {
        remove(0);
    }

    public void remove(int index) {
        Node prev = findNode(index - 1);
        if (prev == null) {
            throw illegalIndex(index);
        }
        Node removed = prev.next;
        if (removed == null) {
            throw illegalIndex(index);
        }
        prev.next = removed.next;
    }
}

