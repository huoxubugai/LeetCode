package linkedlist;

import javax.print.DocFlavor;
import java.util.List;

//LeetCode 61旋转链表
//给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
public class RotateLinkedList {

    public static void main(String[] args) {
        ListNode head = ListNode.getNodeExample();
        ListNode res = rotate(head,2);
        ListNode.printListNode(res);
    }
    //思路 ：其实就是先让尾结点指向头结点形成环，然后再从倒数第k+1个节点处断开
    //1->2->3->4->5   k =2    4->5->1->2->3
    private static ListNode rotate(ListNode head, int k) {
        if(head==null){
            return null;
        }
        int len=1;
        ListNode copy = head;
        while(copy.next!=null){
            len++;
            copy = copy.next;
        }
        //计算链表长度形成环
        copy.next = head;
        //k值可能超过链表长度  因此取余
        int step = len-k % len - 1;
        while(step-->0){
            head = head.next;
        }
        ListNode newHead = head.next;
        head.next =null;
        return newHead;
    }
}
