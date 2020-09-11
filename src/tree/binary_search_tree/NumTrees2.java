package tree.binary_search_tree;

import tree.order.TreeNode;

import java.util.ArrayList;
import java.util.List;


//以1，2，...，n为节点的二叉搜索树的的组合输出

public class NumTrees2 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */

    public static void main(String[] args) {

    }
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<>();
        return dfs(1, n);
    }

    private List<TreeNode> dfs(int l, int r) {
        List<TreeNode> res = new ArrayList<>();
        if (l > r) {
            res.add(null);
            return res;
        }
        //枚举根节点
        for (int i = l; i <= r; i++) {
            //根节点为i，此时左子树为 l~i-1
            List<TreeNode> left = dfs(l, i - 1);
            //右子树为i+1~r
            List<TreeNode> right = dfs(i + 1, r);
            for (TreeNode lh : left) {
                for (TreeNode rh : right) {
                    TreeNode root = new TreeNode(i);
                    root.left = lh;
                    root.right = rh;
                    res.add(root);
                }
            }
        }
        return res;
    }
}
