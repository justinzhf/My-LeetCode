public class Solution260 {
    public int[] singleNumber(int[] nums) {
        int sum1=0;
        int length=nums.length;
        for(int i=0;i<length;i++){
        	sum1^=nums[i];
        }
       	int count=0;
       	while(sum1%2==0){
       		sum1=sum1>>1;
       		count++;
       	}
       	int[] res={0,0};
       	for(int i=0;i<length;i++){
       		if((nums[i]>>count)%2==0){
       			res[0]^=nums[i];
       		}else{
       			res[1]^=nums[i];
       		}
       	}
       	
        return res;
    }
    public static void main(String[] args) {
    	int[] nums={1,1,2,3};
    	Solution260 solution=new Solution260();
    	int[] res=solution.singleNumber(nums);
    	for(int i=0;i<res.length;i++){
    		System.out.println(res[i]);
    	}
    }
}