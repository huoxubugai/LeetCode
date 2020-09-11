package tree.binary_search_tree;

import tree.order.TreeNode;


//将有序数组转换为二叉搜索树
//补充  中序遍历的结果就是一个升序数组，但是中序遍历不能唯一确定一棵树
//因此可能有多个答案，直接用数组的中位数当根节点，一直分治递即可
public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){
            return null;
        }
        return sortedArrayToBST(nums,0,nums.length-1);
    }
    private TreeNode sortedArrayToBST(int[] nums,int left,int right){
        if(left>right){
            return null;
        }
        int mid=left+(right-left)/2;
        TreeNode root =new TreeNode(nums[mid]);
        root.left=sortedArrayToBST(nums,left,mid-1);
        root.right=sortedArrayToBST(nums,mid+1,right);
        return root;
    }
}
