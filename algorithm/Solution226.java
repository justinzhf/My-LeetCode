/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.*;
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
public class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        ArrayDeque<TreeNode> queue=new ArrayDeque<TreeNode>();
        TreeNode temp,p;
        if(root==null){
        	return root;
        }
        queue.add(root);
        while(queue.isEmpty()==false){
        	p=queue.remove();
        	temp=p.left;
        	p.left=p.right;
        	p.right=temp;
        	if(p.left!=null){
        		queue.add(p.left);
        	}
        	if(p.right!=null){
        		queue.add(p.right);
        	}
        }
        return root;
    }

    public void traverse(TreeNode root) {
        ArrayDeque<TreeNode> queue=new ArrayDeque<TreeNode>();
        TreeNode temp,p;
        if(root==null){
        	return;
        }
        queue.add(root);
        while(queue.isEmpty()==false){
        	p=queue.remove();
        	System.out.println(p.val);
        	if(p.left!=null){
        		queue.add(p.left);
        	}
        	if(p.right!=null){
        		queue.add(p.right);
        	}
        }
    }

    public static void main(String[] args) {
    	TreeNode t1=new TreeNode(1);
    	TreeNode t2=new TreeNode(2);
    	TreeNode t3=new TreeNode(3);
    	TreeNode t4=new TreeNode(4);
    	TreeNode t6=new TreeNode(6);
    	TreeNode t7=new TreeNode(7);
    	TreeNode t9=new TreeNode(9);

  /*  	t4.left=t2;
    	t4.right=t7;

    	t2.left=t1;
    	t2.right=t3;

    	t7.left=t6;
    	t7.right=t9;
*/

    	t1.left=t2;
    	t1.right=t3;
    	Solution226 solution=new Solution226();
    	solution.invertTree(t1);
    	solution.traverse(t1);
    	//solution.invertTree(root);
    }
}