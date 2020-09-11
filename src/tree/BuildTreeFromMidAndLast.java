package tree;

import tree.order.TreeNode;

import java.util.Arrays;


//从中序和后序遍历中构造树，思路和前序加中序构造出树基本一致
public class BuildTreeFromMidAndLast {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length==0||postorder.length==0){
            return null;
        }
        TreeNode root=new TreeNode(postorder[postorder.length-1]);
        int i=0;
        while(inorder[i]!=root.val){
            i++;
        }
        root.left=buildTree(Arrays.copyOfRange(inorder,0,i), Arrays.copyOfRange(postorder,0,i));
        root.right=buildTree(Arrays.copyOfRange(inorder,i+1,inorder.length),Arrays.copyOfRange(postorder,i,postorder.length-1));
        return root;
    }
}
