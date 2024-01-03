package list;

public class RemoveNthFromEnd {
    //1 - Recursion
    private int recursion(ListNode p, int n) {
        if (p == null) {
            return 0;
        }
        //nth: next node's position from end
        int nth = recursion(p.next, n);
        System.out.println("Current node: " + p.val + " - Index " + nth + " from end");
        //Delete node
        if (nth == n) {
            // p=3 p.next=4 p.next.next=5
            p.next = p.next.next;
        }
        return nth + 1; //Current node's position from end
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Sentinel: make the head node trackable by recursion
        ListNode s = new ListNode(-1, head);
        recursion(s, n);
        return s.next;
    }

    //2 - 2 pointers
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        //Sentinel
        ListNode s = new ListNode(-1, head);
        ListNode p1 = s;
        ListNode p2 = s;
        //Create the interval between 2 pointers
        for (int i = 0; i < n + 1; i++) {
            p2 = p2.next;
        }
        //Move 2 pointers forward until p2 reach the tail
        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        //Delete node
        p1.next = p1.next.next; //p1.next is the node to be deleted
        return s.next;
    }

    public static void main(String[] args) {
        ListNode o5 = new ListNode(5, null);
        ListNode o4 = new ListNode(4, o5);
        ListNode o3 = new ListNode(3, o4);
        ListNode o2 = new ListNode(2, o3);
        ListNode head = new ListNode(1, o2);
        System.out.println(head);
//        System.out.println(new RemoveNthFromEnd().removeNthFromEnd(head, 5));
        System.out.println(new RemoveNthFromEnd().removeNthFromEnd2(head, 5));
    }
}
