package list;

public class RemoveElementsByValue_SLL {
    //2 pointers
    public ListNode removeElements(ListNode head, int val) {
        ListNode s = new ListNode(-1, head); //Sentinel
        ListNode p1 = s;
        //ListNode p2 = p1.next;
        ListNode p2;
        while ((p2 = p1.next) != null) {
            if (p2.val == val) {
                //Delete node
                p1.next = p2.next;
            } else {
                //Move pointers forward
                p1 = p1.next;
            }
            //Move p2 forward
//            p2 = p1.next;
        }
        return s.next; //Sentinel's next is head
    }

    //Recursion
    public ListNode removeElements2(ListNode p, int val) {
        if (p == null) {
            return null;
        }
        if (p.val == val) {
            return removeElements2(p.next, val);
        } else {
            //Make a jump when deletion is not needed
            p.next = removeElements2(p.next, val);
            return p;
        }
    }

    public static void main(String[] args) {
        ListNode o5 = new ListNode(6, null);
        ListNode o4 = new ListNode(3, o5);
        ListNode o3 = new ListNode(6, o4);
        ListNode o2 = new ListNode(2, o3);
        ListNode head = new ListNode(1, o2);
//        ListNode o5 = new ListNode(7, null);
//        ListNode o4 = new ListNode(7, o5);
//        ListNode o3 = new ListNode(7, o4);
//        ListNode o2 = new ListNode(7, o3);
//        ListNode head = new ListNode(7, o2);
        System.out.println(head);
        System.out.println(new RemoveElementsByValue_SLL().removeElements2(head, 6));
    }
}
