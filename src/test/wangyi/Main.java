package test.wangyi;

import org.omg.CORBA.INTERNAL;
import sun.reflect.generics.tree.Tree;
import tree.order.TreeNode;

import java.util.*;

public class Main {
    static Set<Integer> set = new HashSet<>();
    static Map<Integer, TreeNode> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = scanner.nextLine();
            TreeNode root = buildTree(str);
        }
    }

    private static TreeNode buildTree(String[] str) {
        TreeNode root = new TreeNode(1);
        map.put(1, root);
        set.add(1);
        for (int i = 0; i < str.length; i++) {
            String[] s = str[i].split(" ");
            int id = Integer.parseInt(s[0]);
            String side = s[1];
            int childId = Integer.parseInt(s[2]);
//            if(!set.contains(childId)){
//                TreeNode cur = new TreeNode(childId);
//                set.add(childId);
//            }
            TreeNode cur ;
            if (!map.containsKey(childId)) {
                cur = new TreeNode(childId);
                map.put(childId, cur);
            }else{
                cur = map.get(childId);
            }
            TreeNode curRoot = map.get(id);
            if ("left".equals(side)) {
                curRoot.left = cur;
            }else{
                curRoot.right = cur;
            }
        }
        return root;
    }

    private static void  solution(TreeNode root){
    }
}
