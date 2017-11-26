import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution94{
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack mStack=new Stack();
        List<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        mStack.push(root);
        while (mStack.empty()==false){
            while(root.left!=null){
                root=root.left;
                mStack.push(root);
            }
            root=(TreeNode) mStack.pop();
            list.add(root.val);
            while (root.right==null&&mStack.empty()==false){
                root=(TreeNode) mStack.pop();
                list.add(root.val);
            }
            if(root.right!=null){
                root=root.right;
                mStack.push(root);
            }
        }
        return list;
    }
    public static void main(String[] args) {

    }
}
