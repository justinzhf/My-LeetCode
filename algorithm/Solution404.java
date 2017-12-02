public class Solution404 {


    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        int sum = sumOfLeftLeaves(left);
        sum+=sumOfLeftLeaves(right);
        if (left != null && left.left == null && left.right == null) {
            sum += left.val;
        }
        return sum;


    }


    public static void main(String[] args) {

    }
}
