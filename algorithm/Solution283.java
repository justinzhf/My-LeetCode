public class Solution283{
	public void moveZeroes(int[] nums) {
		int j=nums.length-1;
        for(int i=0;i<nums.length;i++){
        	if(nums[i]==0){
        		for(int h=j;h>=0;h--){
        			if(nums[h]==0){
        				j--;
        			}else{
        				break;
        			}
        		}
        		for(int k=i+1;k<j+1;k++){
        			nums[k-1]=nums[k];
        		}
        		if(i>=j){
        			break;
        		}
        		nums[j]=0;
        		i--;
        	}
        }
    }

    public static void main(String[] args) {
    	int[] a={0,0};
    	Solution283 so=new Solution283();
    	so.moveZeroes(a);
    	for(int i=0;i<a.length;i++){
    		System.out.println(a[i]);
    	}

    }
}