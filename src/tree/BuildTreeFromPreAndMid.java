package tree;

import tree.order.TreeNode;

import java.util.Arrays;

//从前序和中序遍历中构造出树
/*
* 看一下前序和中序有什么特点，前序1,2,4,7,3,5,6,8 ，中序4,7,2,1,5,3,8,6；

有如下特征：

前序中左起第一位1肯定是根结点，我们可以据此找到中序中根结点的位置rootin；
中序中根结点左边就是左子树结点，右边就是右子树结点，即[左子树结点，根结点，右子树结点]，我们就可以得出左子树结点个数为int left = rootin - leftin;；
前序中结点分布应该是：[根结点，左子树结点，右子树结点]；
根据前一步确定的左子树个数，可以确定前序中左子树结点和右子树结点的范围；
如果我们要前序遍历生成二叉树的话，下一层递归应该是：
左子树：root.left = pre_order(前序左子树范围，中序左子树范围，前序序列，中序序列);；
右子树：root.right = pre_order(前序右子树范围，中序右子树范围，前序序列，中序序列);。
每一层递归都要返回当前根结点root；*/
public class BuildTreeFromPreAndMid {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0||inorder.length==0){
            return null;
        }
        TreeNode root=new TreeNode(preorder[0]);
        int i=0;
        while(inorder[i]!=preorder[0]){
            i++;
        }
        root.left=buildTree(Arrays.copyOfRange(preorder,1,i+1),Arrays.copyOfRange(inorder,0,i));
        root.right=buildTree(Arrays.copyOfRange(preorder,i+1,preorder.length),Arrays.copyOfRange(inorder,i+1,inorder.length));
        return root;
    }
}
