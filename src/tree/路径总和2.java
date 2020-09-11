package tree;

import tree.order.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class 路径总和2 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res=new ArrayList<>();
        pathSum(root,res,new ArrayList<>(),sum);
        return res;
    }
    private void pathSum(TreeNode root,List<List<Integer>> res,List<Integer> cur,int sum){
        if(root==null){
            return ;
        }
        cur.add(root.val);
        if(root.left==null&&root.right==null){
            if(root.val==sum){
                res.add(new ArrayList<>(cur));
            }
        }
        //cur.add(root.val);
        // List<Integer> temp=new ArrayList<>(cur);
        pathSum(root.left,res,cur,sum-root.val);
        pathSum(root.right,res,cur,sum-root.val);
        cur.remove(cur.size()-1);
    }
}
