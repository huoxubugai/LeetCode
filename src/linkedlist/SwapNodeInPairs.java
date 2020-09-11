package linkedlist;


//两两交换链表中的节点

public class SwapNodeInPairs {

    public static void main(String[] args) {
        ListNode head = ListNode.getNodeExample();
        ListNode res = swap(head);
        ListNode.printListNode(res);
    }
    // 1->2->3->4->5
    private static ListNode swap(ListNode head){
        if(head==null||head.next==null){
            return head; //这里不是return null
        }
        ListNode next = head.next;
        head.next = swap(next.next); //其实就是三个节点的关系，swap部分看做第三个节点
        next.next = head;
        return next;
    }
}
