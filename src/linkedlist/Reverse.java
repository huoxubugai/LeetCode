package linkedlist;

//反转链表
public class Reverse {


    public static void main(String[] args) {
        ListNode head = ListNode.getNodeByParameter(new int[]{4, 3, 2, 5, 2});
        ListNode.printListNode(head);
        ListNode res = reverse(head);
        ListNode.printListNode(res);
    }

    private static ListNode reverse(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode pre = null; //这里不能写成 new ListNode(-1)
        while(head!=null){
            ListNode next = head.next; //先保存下一个节点
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
