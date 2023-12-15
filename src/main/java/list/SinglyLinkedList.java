package list;

import java.util.Iterator;
import java.util.function.Consumer;

public class SinglyLinkedList implements Iterable<Integer> {
    private Node head = null; //Head node

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node p = head;

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
        //1. List is empty
        //head = new Node(value, null);
        //2. List is not empty
        head = new Node(value, head);
    }

    public void loop1(Consumer<Integer> consumer) {
        Node p = head;
        while (p != null) {
            consumer.accept(p.value);
            p = p.next;
        }
    }

    public void loop2(Consumer<Integer> consumer) {
        for (Node p = head; p != null; p = p.next) {
            consumer.accept(p.value);
        }
    }

    public void loop3() {
        recursion(head);
    }

    public void recursion(Node curr) {
        if (curr == null) {
            return;
        }
        System.out.println(curr.value);
        recursion(curr.next);
    }

    private Node findLast() {
        if (head == null) {
            return null;
        }
        Node p;
        for (p = head; p.next != null; p = p.next) {
        }
        return p;
    }

    public void addLast(int value) {
        Node last = findLast();
        if (last == null) {
            addFirst(value);
            return;
        }
        last.next = new Node(value, null);
    }

    /*public void test() {
        int i = 0;
        for (Node p = head; p != null; p = p.next, i++) {
            System.out.println(p.value + "'s index: " + i);
        }
    }*/

    private Node findNode(int index) { //Return the object -> should be private for security use
        int i = 0;
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
        if (index == 0) {
            addFirst(value);
            return;
        }
        Node prev = findNode(index - 1);
        if (prev == null) {
            throw illegalIndex(index);
        }
        prev.next = new Node(value, prev.next);
    }

    public void removeFirst() {
        if (head == null) {
            throw illegalIndex(0);
        }
        head = head.next;
    }

    public void remove(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }
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

