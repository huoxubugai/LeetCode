package linkedlist;


//反转从m到n部分的链表
public class Reverse2 {

    public static void main(String[] args) {
        ListNode head = ListNode.getNodeByParameter(new int[]{4, 3, 2, 5, 2});
        ListNode.printListNode(head);
        ListNode res = reverse(head,2,4);
        ListNode.printListNode(res);
    }

    private static ListNode reverse(ListNode head, int m, int n) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = head;
        for(int i=1;i<m-1;i++){
            pre = pre.next;
        }
        head = pre.next;
        for(int i=m;i<n;i++){
            ListNode next = head.next;
            head.next = next.next;
            next.next = pre.next; //这里不能写成next.next=head;注意pre是不变的
            pre.next = next;
        }
        return dummy.next;
    }
}
