package test.wangyi;

import tree.order.TreeNode;

import java.util.*;

public class Main2 {
    static Map<Integer, Integer> childToParent = new HashMap<>();
    static Map<Integer, Integer> leftChild = new HashMap<>();
    static Map<Integer, Integer> rightChild = new HashMap<>();
    static Set<Integer> parent = new HashSet<>();
    static Set<Integer> res = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(); //m个节点
        int[] nodes = new int[m];
        int n = scanner.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = scanner.nextLine();
            TreeNode root = buildTree(str,nodes);
        }
    }

    private static TreeNode buildTree(String[] str,int[] nodes) {
        for (int i = 0; i < str.length; i++) {
            String[] s = str[i].split(" ");
            int id = Integer.parseInt(s[0]);
            String side = s[1];
            int childId = Integer.parseInt(s[2]);
            if(!parent.contains(id)){
                parent.add(id);
            }
            childToParent.put(childId, id);
            if("left".equals(side)){
                leftChild.put(id, childId);
            }else{
                rightChild.put(id, childId);
            }
        }


        return null;
    }
}
