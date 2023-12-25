package list;

class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return val + "->" + next;
    }
}

public class ReverseSinglyLinkedList {
    static class List {
        ListNode head;

        public List(ListNode head) {
            this.head = head;
        }

        public void addFirst(ListNode first) {
            first.next = head;
            head = first;
        }

        public ListNode removeFirst() {
            ListNode first = head;
            if (first != null) {
                head = first.next;
            }
            return first;
        }
    }

    //Method 1: create new list and copy values
    public ListNode reverseList1(ListNode o1) {
        ListNode n1 = null;
        ListNode p = o1;
        while (p != null) {
            n1 = new ListNode(p.val, n1);
            p = p.next;
        }
        return n1;
    }

    //Method 2: move nodes
    public ListNode reverseList2(ListNode head) {
        List list1 = new List(head);
        List list2 = new List(null);
        while (true) {
            ListNode first = list1.removeFirst();
            if (first == null) {
                break;
            }
            list2.addFirst(first);
        }
        return list2.head;
    }

    //Method 3: recursion
    public ListNode reverseList3(ListNode p) {
        if (p == null || p.next == null) {
            return p; //Last node
        }
        ListNode last = reverseList3(p.next);
        p.next.next = p; //Reverse direction, ex:  p=4, p.next=5, 4->5  5->4
        p.next = null; //Break the circle since 4->5 and 5->4
        return last;
    }

    public static void main(String[] args) {
        ListNode o5 = new ListNode(5, null);
        ListNode o4 = new ListNode(4, o5);
        ListNode o3 = new ListNode(3, o4);
        ListNode o2 = new ListNode(2, o3);
        ListNode o1 = new ListNode(1, o2);
        System.out.println(o1);
//        ListNode n1 = new ReverseSinglyLinkedList().reverseList(o1);
//        ListNode n1 = new ReverseSinglyLinkedList().reverseList2(o1);
        ListNode n1 = new ReverseSinglyLinkedList().reverseList3(o1);
        System.out.println(n1);
    }
}