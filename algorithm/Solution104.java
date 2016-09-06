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
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){val=x;}
}
public class Solution104 {
    public int maxDepth(TreeNode root) {
    	int maxDepth=0;
    	ArrayDeque<TreeNode> queue1=new ArrayDeque<TreeNode>();
    	ArrayDeque<TreeNode> queue2=new ArrayDeque<TreeNode>();
    	ArrayDeque<TreeNode> p,q,t;
    	if(root==null){
    		return 0;
    	}
    	queue1.offer(root);
    	q=queue1;
    	p=queue2;
    	while((queue1.isEmpty()==false)||(queue2.isEmpty()==false)){
    		while(q.isEmpty()==false){
    			TreeNode temp=q.peek();
    			q.poll();
				if(temp.left!=null){
					p.offer(temp.left);
				}
				if(temp.right!=null){
					p.offer(temp.right);
				}
    		}
    		maxDepth++;
    		t=p;
    		p=q;
    		q=t;
    	}
    	return maxDepth;
    }
    public static void main(String[] args){
    	TreeNode t1=new TreeNode(1);
    	TreeNode t2=new TreeNode(1);
    	TreeNode t3=new TreeNode(1);
    	TreeNode t4=new TreeNode(1);
    	t1.left=t2;
    	t1.right=t3;
    	t3.left=t4;
    	Solution104 solution=new Solution104();
    	System.out.println(solution.maxDepth(t1));
    }
}