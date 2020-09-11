package tree.binary_search_tree;

import tree.order.TreeNode;


public class IsValidBST {



    //正确解法1：判断中序遍历是否为升序

    //正确解法2：使用最大值，最小值来存储根节点的值，左子树的节点值需要全小于根节点，右边全大于根节点
    public boolean trueIsValidBST(TreeNode root){

        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode root, long minValue, long maxValue) {
        if(root==null){
            return true;
        }
        if(root.val<=minValue||root.val>=maxValue){
            return false;
        }
        return isValidBST(root.left,minValue,root.val)&&isValidBST(root.right,root.val,maxValue);
    }


    //错误解法
    //这种做法只考虑了根节点大于左节点小于右节点的情况，注意这不是二叉搜索树的唯一特性
    public boolean wrongIsValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left != null) {
            if (root.val <= root.left.val) {
                return false;
            }
        }
        if (root.right != null) {
            if (root.val >= root.right.val) {
                return false;
            }
        }
        return wrongIsValidBST(root.right) && wrongIsValidBST(root.left);
    }
}
