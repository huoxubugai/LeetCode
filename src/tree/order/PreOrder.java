package tree.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> res = preOrderTraversal(root);
        List<Integer> res2 = preOrderTraversal2(root);

        for (int num : res) {
            System.out.printf("%2d", num);
        }
        System.out.println("\n");

        for (int num : res2) {
            System.out.printf("%2d", num);
        }
        System.out.println("\n");
    }

    //非递归写法  用栈实现
    private static List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                res.add(root.val);
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                root = root.right;
            }
        }
        return res;
    }

    //递归写法
    private static List<Integer> preOrderTraversal2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preOrderTraversal2(root, res);
        return res;
    }

    private static void preOrderTraversal2(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        preOrderTraversal2(root.left, res);
        preOrderTraversal2(root.right, res);
    }
}
