package tree;

import tree.order.TreeNode;


//判断树是否是高度平衡的二叉树，所有左右子树高度差不超过1
public class IsBalanced {
    class Solution {
        public boolean isBalanced(TreeNode root) {
            if(root==null) return true;
            return Math.abs(depth(root.left)-depth(root.right))<=1
                    &&isBalanced(root.left)
                    &&isBalanced(root.right);
        }
        private int depth(TreeNode root){
            if(root==null) return 0;
            return Math.max(depth(root.left),depth(root.right))+1;
        }
    }
}