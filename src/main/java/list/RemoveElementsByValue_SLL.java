package list;

public class RemoveElementsByValue_SLL {
    //2 pointers
    public ListNode removeElements(ListNode head, int val) {
        ListNode s = new ListNode(-1, head); //Sentinel
        ListNode p1 = s;
        ListNode p2 = s.next;
        while (p2 != null) {
            if (p2.val == val) {
                //Delete node, move p2 forward
                p1.next = p2.next;
                p2 = p2.next;
            } else {
                //Move pointers forward
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        return s.next; //Sentinel's next is head
    }

    public static void main(String[] args) {
//        ListNode o5 = new ListNode(6, null);
//        ListNode o4 = new ListNode(3, o5);
//        ListNode o3 = new ListNode(6, o4);
//        ListNode o2 = new ListNode(2, o3);
//        ListNode head = new ListNode(1, o2);
        ListNode o5 = new ListNode(7, null);
        ListNode o4 = new ListNode(7, o5);
        ListNode o3 = new ListNode(7, o4);
        ListNode o2 = new ListNode(7, o3);
        ListNode head = new ListNode(7, o2);
        System.out.println(head);
        System.out.println(new RemoveElementsByValue_SLL().removeElements(head, 7));
    }
}
