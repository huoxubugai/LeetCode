package linkedlist;

//删除链表倒数第k个节点
//思路就是  一个复制的头结点先走k步，然后两个复制的头结点同时开始走，
// 当快指针走到链表末尾时，慢指针刚好走到待删除节点的前一个节点
public class DeleteNthNodeFromEnd {

    public static void main(String[] args) {
        ListNode head = ListNode.getNodeExample();
        ListNode.printListNode(head);
        ListNode res = delete(head, 4);
        ListNode.printListNode(res);

    }
    private static ListNode delete(ListNode head,int k){
        ListNode head1 = head;
        ListNode head2 = head;
        while(k-->0){
            head1 = head1.next;
            //注意特例：当删除的节点是头结点时
            if (head1==null){
                return head.next;
            }
        }
        while(head1!=null&&head1.next!=null){
            head1 = head1.next;
            head2 = head2.next;
        }
        head2.next = head2.next.next;
        return head;
    }
}
