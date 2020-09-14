package linkedlist;


//环形链表2，找到成环的入口节点
public class CycleList2 {

    public static void main(String[] args) {

    }
    //思路：先判断是否是环形链表
    //如果是，先让快满指针一起走，相遇时，让慢指针和头结点一步步往前走，两者相遇的点必是入幻点
    public static ListNode cycle(ListNode head){
        //先判断链表是否有环
        if(head==null||head.next==null){
            return null;
        }
        ListNode fast = head, slow = head;
        boolean hasCycle = false;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                hasCycle = true;
                break;  //记得要跳出
            }
        }
        if(hasCycle){
            return getNode(head,slow);
        }else{
            return null;
        }
    }

    private static ListNode getNode(ListNode head,ListNode slow) {
        while(slow!=head){
            slow = slow.next;
            head = head.next;
        }
        return slow;
    }

}
