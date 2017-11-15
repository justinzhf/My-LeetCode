public class Solution606 {


    class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    public String tree2str(TreeNode t) {

        if(t==null){
            return "";
        }

        if((t.left!=null)&&(t.right==null)){
            String str1=tree2str(t.left);
            return t.val+"("+str1+")";
        }else if(t.left==null&&t.right==null){
            return t.val+"";
        }else {
            String str1=tree2str(t.left);
            String str2=tree2str(t.right);
            return t.val+"("+str1+")"+"("+str2+")";
        }



    }
    public static void main(String[] args) {

    }
}
