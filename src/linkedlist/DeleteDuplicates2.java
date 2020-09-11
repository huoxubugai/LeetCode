package linkedlist;



public class DeleteDuplicates2 {
    public static void main(String[] args) {
        ListNode head = ListNode.getNodeByParameter(new int[]{1, 1, 2, 3, 3, 4});
        ListNode.printListNode(head);
        ListNode res = delete(head);
        ListNode.printListNode(res);

    }

    private static ListNode delete(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode cur = head;
        ListNode nextNode = head.next;

        return head;
    }
}
