package tree.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LastOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> res = postOrderTraversal(root);
        for (int num : res) {
            System.out.printf("%2d", num);
        }
        System.out.println("\n");
    }

    //后序遍历  碰到一个节点就放入栈中，节点值逆序添加进list
    public static List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root==null){
            return res;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            res.add(0, cur.val); //逆序添加
            if(cur.left!=null){
                stack.push(cur.left);
            }
            if(cur.right!=null){
                stack.push(cur.right);
            }
        }
        return res;
    }

}
