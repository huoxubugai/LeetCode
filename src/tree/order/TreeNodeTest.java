package tree.order;

public class TreeNodeTest {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(1);
        System.out.println(node1.equals(node2));
        node1.left = node2;
        System.out.println(node1.equals(node2));

    }
}
