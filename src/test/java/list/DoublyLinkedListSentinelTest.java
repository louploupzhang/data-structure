package list;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class DoublyLinkedListSentinelTest {
    private DoublyLinkedListSentinel getLinkedList() {
        DoublyLinkedListSentinel list = new DoublyLinkedListSentinel();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        return list;
    }

    @Test
    public void addFirst() {
        DoublyLinkedListSentinel list = getLinkedList();
        list.addFirst(5);

        Assertions.assertIterableEquals(List.of(5, 1, 2, 3, 4), list);
    }

    @Test
    public void addLast() {
        DoublyLinkedListSentinel list = getLinkedList();
        list.addLast(5);

        Assertions.assertIterableEquals(List.of(1, 2, 3, 4, 5), list);
    }

    @Test
    public void removeLast() {
        DoublyLinkedListSentinel list = getLinkedList();
        list.removeLast();

        Assertions.assertIterableEquals(List.of(1, 2, 3), list);
    }

    @Test
    public void insert() {
        DoublyLinkedListSentinel list = getLinkedList();
        list.insert(2, 5);
        Assertions.assertIterableEquals(List.of(1, 2, 5, 3, 4), list);
        list.insert(5, 6);
        Assertions.assertIterableEquals(List.of(1, 2, 5, 3, 4, 6), list);
        Assertions.assertThrows(IllegalArgumentException.class, () -> list.insert(8, 3));
        Assertions.assertThrows(IllegalArgumentException.class, () -> list.insert(-1, 3));
    }

    @Test
    public void remove() {
        DoublyLinkedListSentinel list = getLinkedList();
        list.remove(3);

        Assertions.assertIterableEquals(List.of(1, 2, 3), list);
    }
}
