package linkedlist;

import tree.order.TreeNode;

//分隔链表
//给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。
//
//你应当保留两个分区中每个节点的初始相对位置。
//
//示例:
//
//输入: head = 1->4->3->2->5->2, x = 3
//输出: 1->2->2->4->3->5
//
public class Partition {
    public static void main(String[] args) {
        ListNode head = ListNode.getNodeByParameter(new int[]{4, 3, 2, 5, 2});
        ListNode.printListNode(head);
        ListNode res = partition(head,3);
        ListNode.printListNode(res);
    }
    //虚构两个头节点，一个存储小于x节点的部分，一个存储大于等于的部分，(注意这里不能是小于等于)
    //然后拼接起来
    private static ListNode partition(ListNode head,int x) {
        ListNode head1 = new ListNode(-1);
        ListNode head2 = new ListNode(-1);
        ListNode copy1 = head1;
        ListNode copy2 = head2;
        while(head!=null){
            ListNode cur = new ListNode(head.val);
            if(head.val<x){   //注意这里不能是<=  导致结果出错
                copy1.next = cur;
                copy1 = copy1.next;
            }else{
                copy2.next = cur;
                copy2 = copy2.next;
            }
            head = head.next;
        }
        //拼接
        copy1.next = head2.next;
        return head1.next;
    }
}
