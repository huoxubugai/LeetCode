package tree;

import tree.order.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


//二叉树的右视图，左视图做法也一样，记录每层的第一个数字即可
public class RightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        //用层序遍历  记录下每层最后一个值即可
        List<Integer> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size-->0){
                TreeNode cur=queue.poll();
                if(size==0){
                    res.add(cur.val);
                }
                if(cur.left!=null){
                    queue.add(cur.left);
                }
                if(cur.right!=null){
                    queue.add(cur.right);
                }
            }
        }
        return res;
    }
}
