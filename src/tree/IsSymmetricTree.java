package tree;

import tree.order.TreeNode;

public class IsSymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isSymmetric(root.left,root.right);
    }

    private boolean isSymmetric(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }
        if(p!=null&&q!=null){
            if(p.val!=q.val){
                return false;
            }
            return isSymmetric(p.left,q.right)&&isSymmetric(p.right,q.left);
        }
        return false;
    }
}
