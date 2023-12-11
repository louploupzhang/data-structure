package list;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.util.List;

public class SinglyLinkedListSentinelTest {
    private SinglyLinkedListSentinel getLinkedList() {
        SinglyLinkedListSentinel list = new SinglyLinkedListSentinel();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        return list;
    }

    @Test
    @DisplayName("addLast")
    public void test1() {
        SinglyLinkedListSentinel list = getLinkedList();

        Assertions.assertIterableEquals(List.of(1, 2, 3, 4), list);
    }

    @Test
    @DisplayName("get")
    public void test2() {
        SinglyLinkedListSentinel list = getLinkedList();

        Assertions.assertEquals(3, list.get(2));
        Assertions.assertThrows(IllegalArgumentException.class, () -> list.get(10));
    }

    @Test
    @DisplayName("insert")
    public void test3() {
        SinglyLinkedListSentinel list = getLinkedList();
        list.insert(0, 5);
        Assertions.assertIterableEquals(List.of(5, 1, 2, 3, 4), list);

        list = getLinkedList();
        list.insert(2, 5);
        Assertions.assertIterableEquals(List.of(1, 2, 5, 3, 4), list);

        list = getLinkedList();
        list.insert(4, 5);
        Assertions.assertIterableEquals(List.of(1, 2, 3, 4, 5), list);

        Assertions.assertThrows(IllegalArgumentException.class, () -> getLinkedList().insert(5, 5));

        list = getLinkedList();
        list.addFirst(5);
        Assertions.assertIterableEquals(List.of(5, 1, 2, 3, 4), list);

        SinglyLinkedListSentinel list2 = new SinglyLinkedListSentinel();
        list2.addFirst(1);
        Assertions.assertIterableEquals(List.of(1), list2);
    }

    @Test
    @DisplayName("remove")
    public void test4() {
        SinglyLinkedListSentinel list1 = getLinkedList();
        list1.remove(2);
        Assertions.assertIterableEquals(List.of(1,2,4), list1);

        SinglyLinkedListSentinel list2 = getLinkedList();
        list2.remove(0);
        Assertions.assertIterableEquals(List.of(2,3,4), list2);

        SinglyLinkedListSentinel list3 = getLinkedList();
        Assertions.assertThrows(IllegalArgumentException.class, () -> getLinkedList().remove(5));

        SinglyLinkedListSentinel list4 = getLinkedList();
        Assertions.assertThrows(IllegalArgumentException.class, () -> getLinkedList().remove(4));
    }

    @Test
    @DisplayName("removeFirst")
    public void test5() {
        SinglyLinkedListSentinel list = getLinkedList();
        list.removeFirst();
        Assertions.assertIterableEquals(List.of(2,3, 4), list);
        list.removeFirst();
        Assertions.assertIterableEquals(List.of(3, 4), list);
        list.removeFirst();
        Assertions.assertIterableEquals(List.of(4), list);
        list.removeFirst();
        Assertions.assertIterableEquals(List.of(), list);
        Assertions.assertThrows(IllegalArgumentException.class, list::removeFirst);
    }
}
