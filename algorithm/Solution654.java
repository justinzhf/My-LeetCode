import jdk.nashorn.api.tree.Tree;

public class Solution654 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length<=0){
            return null;
        }
        int maxIndex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[maxIndex]<nums[i]){
                maxIndex=i;
            }
        }
        TreeNode rootNode=new TreeNode(nums[maxIndex]);
        int[] lnums=new int[maxIndex];
        int[] rnums=new int[nums.length-maxIndex-1];
        for(int i=0;i<maxIndex;i++){
            lnums[i]=nums[i];
        }
        for(int i=maxIndex+1;i<nums.length;i++){
            rnums[i-maxIndex-1]=nums[i];
        }
        TreeNode lnode=constructMaximumBinaryTree(lnums);
        TreeNode rnode=constructMaximumBinaryTree(rnums);
        rootNode.left=lnode;
        rootNode.right=rnode;
        return  rootNode;
    }

    public static void main(String[] args) {
        int[] nums={};
        TreeNode treeNode=new Solution654().constructMaximumBinaryTree(nums);
        int i=0;
        i++;
    }
}
