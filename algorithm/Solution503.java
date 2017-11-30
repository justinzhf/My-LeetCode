import java.util.Stack;

public class Solution503 {
    public int[] nextGreaterElements(int[] nums) {
        Stack mStack=new Stack();
        for(int i=nums.length-1;i>=0;i--){
            mStack.push(nums[i]);
        }
        int[] res=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            while (mStack.isEmpty()==false&&(Integer)mStack.peek()<=nums[i]){
                mStack.pop();
            }
            if(mStack.empty()==false){
                res[i]=(Integer) mStack.peek();
            }else {
                res[i]=-1;
            }
            mStack.push(nums[i]);
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
