package linkedlist;

import java.util.List;

public class AddTwoNumbers {


    public static void main(String[] args) {
        ListNode root1 = new ListNode(2);
        root1.next = new ListNode(4);
        root1.next.next = new ListNode(3);
        ListNode root2 = new ListNode(5);
        root2.next = new ListNode(6);
        root2.next.next = new ListNode(4);
        ListNode res = solution(root1, root2);
        while(res!=null){
            System.out.println(res.val);
            res = res.next;
        }
    }

    private static ListNode solution(ListNode root1, ListNode root2) {
        ListNode root = new ListNode(-1);
        ListNode copy = root;
        int carry = 0;
        while(root1!=null||root2!=null||carry!=0){
            int val1 = root1 == null ? 0 : root1.val;
            int val2 = root2 == null ? 0 : root2.val;
            int cur = val1 + val2 + carry;
            copy.next = new ListNode(cur % 10);
            carry = cur / 10;
            copy = copy.next;
            root1 = root1 == null ? root1 : root1.next;//不能这么写：root1 = root1.next;，因为root1可能为空
            root2 = root2 == null ? root2 : root2.next;//root2 = root2.next;
        }
        return root.next;
    }
}
