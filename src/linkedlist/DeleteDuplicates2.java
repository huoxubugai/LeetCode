package linkedlist;



public class DeleteDuplicates2 {
    public static void main(String[] args) {
        ListNode head = ListNode.getNodeByParameter(new int[]{1, 1, 2, 3, 3, 4});
        ListNode.printListNode(head);
        ListNode res = delete(head);
        ListNode.printListNode(res);

    }

    //用递归做 参考LeetCode评论
    private static ListNode delete(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode nextNode = head.next;
        //如果是这种情况
        //      1 --> 1 --> 1 --> 2 --> 3
        //     head  next
        //1.则需要移动next直到出现与当前head.value不相等的情况（含null）
        //2.并且此时的head已经不能要了，因为已经head是重复的节点
        //--------------else-------------
        //      1 --> 2 --> 3
        //     head  next
        //3.如果没有出现1的情况，则递归返回的节点就作为head的子节点
        if(head.val==head.next.val){
            while(nextNode!=null&&head.val==nextNode.val){
                nextNode = nextNode.next;
            }
            head = delete(nextNode);
        }else{
            head.next = delete(nextNode);
        }
        return head;
    }
}
