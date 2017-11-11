public class Solution617 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode rootNode = null,lNode=null,rNode=null;
        if (t1 != null && t2 != null) {
            rootNode = new TreeNode(t1.val + t2.val);
            lNode=mergeTrees(t1.left,t2.left);
            rNode=mergeTrees(t1.right,t2.right);
            rootNode.left=lNode;
            rootNode.right=rNode;
        } else if (t1 == null && t2 != null) {
            rootNode = new TreeNode(t2.val);
            lNode=mergeTrees(null,t2.left);
            rNode=mergeTrees(null,t2.right);
            rootNode.left=lNode;
            rootNode.right=rNode;
        } else if (t1 != null && t2 == null) {
            rootNode = new TreeNode(t1.val);
            lNode=mergeTrees(t1.left,null);
            rNode=mergeTrees(t1.right,null);
            rootNode.left=lNode;
            rootNode.right=rNode;
        }else if(t1==null&&t2==null){
            //nothing to do
        }


        return rootNode;
    }

    public static void main(String[] args) {

    }
}
