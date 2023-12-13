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
}
