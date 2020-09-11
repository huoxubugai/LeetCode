package tree;

import tree.order.TreeNode;


//二叉树最小深度
public class MinDepth {

    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left!=null&&root.right!=null){
            return 1+Math.min(minDepth(root.left),minDepth(root.right)); //注意不能直接返回这一句，得先判断
        }else{
            return 1+minDepth(root.left)+minDepth(root.right);//这里有一项必定为0
        }

    }
}
