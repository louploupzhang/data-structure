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

    public static void main(String[] args) {
        ListNode o5 = new ListNode(5, null);
        ListNode o4 = new ListNode(4, o5);
        ListNode o3 = new ListNode(3, o4);
        ListNode o2 = new ListNode(2, o3);
        ListNode head = new ListNode(1, o2);
        System.out.println(head);
        System.out.println(new RemoveNthFromEnd().removeNthFromEnd(head, 5));
    }
}
