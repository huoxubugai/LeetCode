package tree.binary_search_tree;

import java.util.Scanner;
//以1，2，...，n为节点的二叉搜索树的个数
public class NumTrees {

    //结题思路：假设n个节点存在二叉排序树的个数是G(n)，1为根节点，2为根节点，...，n为根节点
    // ，当1为根节点时，其左子树节点个数为0，右子树节点个数为n-1，同理当2为根节点时，其左子树
    // 节点个数为1，右子树节点为n-2，所以可得G(n) = G(0)*G(n-1)+G(1)*(n-2)+...+G(n-1)*G(0)

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int res = new NumTrees().numTrees(n);
        System.out.println(res);
    }
    public int numTrees(int n) {
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
}
