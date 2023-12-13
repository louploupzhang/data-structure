package list;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class DoublyLinkedListCycleSentinelTest {
    private DoublyLinkedListCycleSentinel getLinkedList() {
        DoublyLinkedListCycleSentinel list = new DoublyLinkedListCycleSentinel();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        return list;
    }

    @Test
    public void addFirst() {
        DoublyLinkedListCycleSentinel list = getLinkedList();
        list.addFirst(5);

        Assertions.assertIterableEquals(List.of(5, 1, 2, 3, 4), list);
    }

    @Test
    public void addLast() {
        DoublyLinkedListCycleSentinel list = getLinkedList();
        list.addLast(5);

        Assertions.assertIterableEquals(List.of(1, 2, 3, 4, 5), list);
    }

    @Test
    public void removeFirst() {
        DoublyLinkedListCycleSentinel list = getLinkedList();
        list.removeFirst();
        Assertions.assertIterableEquals(List.of(2, 3, 4), list);
        list.removeFirst();
        Assertions.assertIterableEquals(List.of(3, 4), list);
        list.removeFirst();
        Assertions.assertIterableEquals(List.of(4), list);
        list.removeFirst();
        Assertions.assertIterableEquals(List.of(), list);
        Assertions.assertThrows(IllegalArgumentException.class, list::removeFirst);
    }

    @Test
    public void removeLast() {
        DoublyLinkedListCycleSentinel list = getLinkedList();
        list.removeLast();
        Assertions.assertIterableEquals(List.of(1, 2, 3), list);
        list.removeLast();
        Assertions.assertIterableEquals(List.of(1, 2), list);
        list.removeLast();
        Assertions.assertIterableEquals(List.of(1), list);
        list.removeLast();
        Assertions.assertIterableEquals(List.of(), list);
        Assertions.assertThrows(IllegalArgumentException.class, list::removeLast);
    }

    @Test
    public void removeByValue() {
        DoublyLinkedListCycleSentinel list = getLinkedList();
        list.removeByValue(1);
        Assertions.assertIterableEquals(List.of(2, 3, 4), list);
        list.removeByValue(3);
        Assertions.assertIterableEquals(List.of(2, 4), list);
        list.removeByValue(2);
        Assertions.assertIterableEquals(List.of(4), list);
        list.removeByValue(4);
        Assertions.assertIterableEquals(List.of(), list);
    }
}
