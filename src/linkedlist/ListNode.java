package linkedlist;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode getNodeExample() {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        return head;
    }

    public static ListNode getNodeByParameter(int[] val){
        ListNode head = new ListNode(1);
        ListNode copy = head;
        for (int num : val) {
            copy.next = new ListNode(num);
            copy = copy.next;
        }
        return head;
    }

    public static void printListNode(ListNode head){
        while(head!=null){
            System.out.print(head.val+"->");
            head = head.next;
        }
        System.out.println();
    }
}


