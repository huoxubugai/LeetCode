package tree;

import tree.order.TreeNode;

public class MaxDepth {

    // 也可以一行代码解决
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
