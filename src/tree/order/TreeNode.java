package tree.order;

public  class TreeNode    {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    //重写equals  只要节点里面的值相等  则认为两个节点是一样的
    @Override
    public boolean equals(Object obj){
        if(obj instanceof TreeNode){
            TreeNode node = (TreeNode) obj;
            return this.val == node.val;
        }
        return false;
    }

    @Override
    public int hashCode( ){
        return 31*val;
    }
}