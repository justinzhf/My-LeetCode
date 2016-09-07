import java.util.*;
public class Solution384 {

	private int[] nums;

    public Solution384(int[] nums) {
        this.nums=nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return this.nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        	Random r=new Random();
        	int i=0,n=nums.length;
        	int[] tag=new int[n];
        	int[] res=new int[n];
        	int index=0;
        	while(i<n){
        		index=r.nextInt(n);
        		while(tag[index]==1){
					index=r.nextInt(n);
        		}
        		res[index]=nums[i];
        		tag[index]=1;
        		i++;
        	}
        	return res;

    }
    public static void main(String[] args) {
    	int[] a={1,2};
    	Solution384 s=new Solution384(a);
    	int[] b=s.shuffle();
    	for(int i=0;i<b.length;i++){
    		System.out.print(b[i]+"   ");
    	}
    	System.out.println("");
    	b=s.shuffle();
    	for(int i=0;i<b.length;i++){
    		System.out.print(b[i]+"   ");
    	}
    	System.out.println("");
    	b=s.shuffle();
    	for(int i=0;i<b.length;i++){
    		System.out.print(b[i]+"   ");
    	}
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */