public class Solution623 {
    private int curDepth = 0;

    public TreeNode addOneRow(TreeNode root, int v, int d) {
        curDepth += 1;
        if (root == null) {
            curDepth -= 1;
            return root;
        }
        if(d==1){
            TreeNode node=new TreeNode(v);
            node.left=root;
            root=node;
            return root;
        }
        if (curDepth == d - 1) {

            TreeNode node = new TreeNode(v);
            node.left = root.left;
            root.left = node;


            TreeNode node1 = new TreeNode(v);
            node1.right = root.right;
            root.right = node1;

            curDepth -= 1;
            return root;
        }
        addOneRow(root.left, v, d);
        addOneRow(root.right, v, d);
        curDepth -= 1;
        return root;

    }

    public static void main(String[] args) {

    }
}
