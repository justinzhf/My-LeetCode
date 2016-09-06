/*
*/

public class Solution136 {
    public int singleNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
        	sum^=nums[i];
        }
        return sum;
    }

    public static void main(String[] args){
    	Solution136 solution=new Solution136();
    	int[] arr={1,2,3,4,5,5,4,3,1};
    	System.out.println(solution.singleNumber(arr));
    }
}
