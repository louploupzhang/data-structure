package list;

import org.junit.Test;

public class SinglyLinkedListTest {
    @Test
    public void test1() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);

        list.loop2(value -> {
            System.out.println(value);
        });
    }

    @Test
    public void test2() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);

        for (Integer value : list) {
            System.out.println(value);
        }
    }

    @Test
    public void test3() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        //Assertions.assertIterableEquals(List.of(1, 2, 3, 4), list);

//        list.test();

        int i = list.get(10);
        System.out.println(i);
    }

    @Test
    public void test4() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3); //2
        list.addLast(4); //3
        //4

        list.insert(0,5);
        for (Integer v : list) {
            System.out.println(v);
        }
    }

    @Test
    public void test5() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        list.removeFirst();
        for (Integer v : list) {
            System.out.println(v);
        }

        System.out.println("=====================");
        list.removeFirst();
        for (Integer v : list) {
            System.out.println(v);
        }
        System.out.println("=====================");
        list.removeFirst();
        for (Integer v : list) {
            System.out.println(v);
        }

        System.out.println("=====================");
        list.removeFirst();
        for (Integer v : list) {
            System.out.println(v);
        }

        list.removeFirst();
    }

    @Test
    public void test6() {
        /*SinglyLinkedList list1 = new SinglyLinkedList();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);
        list1.addLast(4);
        list1.remove(2);
        for (Integer v : list1) {
            System.out.println(v);
        }*/

        /*SinglyLinkedList list2 = new SinglyLinkedList();
        list2.addLast(1);
        list2.addLast(2);
        list2.addLast(3);
        list2.addLast(4);
        list2.remove(0);
        for (Integer v : list2) {
            System.out.println(v);
        }*/

        /*SinglyLinkedList list3 = new SinglyLinkedList();
        list3.addLast(1);
        list3.addLast(2);
        list3.addLast(3);
        list3.addLast(4);
        list3.remove(5);*/

        SinglyLinkedList list4 = new SinglyLinkedList();
        list4.addLast(1); //0
        list4.addLast(2); //1
        list4.addLast(3); //2
        list4.addLast(4); //3
        list4.remove(4);
    }
}
