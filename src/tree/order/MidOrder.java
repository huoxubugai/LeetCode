package tree.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



public class MidOrder {


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> res = inorderTraversal(root);
        List<Integer> res2 = inorderTraversal2(root);
        for (int num : res) {
            System.out.printf("%2d", num);
        }
        System.out.println("\n");
        for (int num : res2) {
            System.out.printf("%2d", num);
        }
        System.out.println("\n");
    }


    //非递归写法，借助栈实现
    private static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (!stack.isEmpty() || cur != null) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                res.add(cur.val);
                cur = cur.right;
            }
        }
        return res;
    }

    //递归写法
    private static List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorderTraversal2(root, res);
        return res;
    }

    private static void inorderTraversal2(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorderTraversal2(root.left, res);
        res.add(root.val);
        inorderTraversal2(root.right, res);
    }

}
