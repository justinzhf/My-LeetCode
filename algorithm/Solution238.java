public class Solution238{
	public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        res[0]=1;
        for(int i=1;i<n;i++){
        	res[i]=res[i-1]*nums[i-1];
        }
        int[] right=new int[n];
        right[n-1]=1;
        for(int i=n-2;i>=0;i--){
        	right[i]=right[i+1]*nums[i+1];
        	res[i]*=right[i];
        }
        return res;
    }
    public static void main(String[] args) {
    	Solution238 so=new Solution238();
    	int[] a={1,2};
    	int[] b=so.productExceptSelf(a);
    	for(int i=0;i<b.length;i++){
    		System.out.println(b[i]);
    	}

    }
}