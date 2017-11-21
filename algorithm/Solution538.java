import java.util.ArrayList;
import java.util.Stack;

public class Solution538 {
    public TreeNode convertBST(TreeNode root) {
        Stack mStack = new Stack();
        if(root==null){
            return null;
        }
        TreeNode node=root;
        mStack.push(node);
        int sum=0;
        while(mStack.empty()==false){
            while (node.right!=null){
                node=node.right;
                mStack.push(node);

            }
            node=(TreeNode) mStack.pop();
            node.val+=sum;
            sum=node.val;
            while(node.left==null&&mStack.empty()==false){
                node=(TreeNode) mStack.pop();
                node.val+=sum;
                sum=node.val;
            }
            if(node.left!=null){
                node=node.left;
                mStack.push(node);
            }

        }
        return root;
    }

    private void bfs(TreeNode root) {

    }

    public static void main(String[] args) {

    }
}
