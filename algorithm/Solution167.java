public class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr={0,numbers.length-1};
        int sum;
        sum=numbers[arr[0]]+numbers[arr[1]];
        while(sum!=target){
        	if(sum<target){
        		arr[0]++;
        	}else if(sum>target){
        		arr[1]--;
        	}
        	sum=numbers[arr[0]]+numbers[arr[1]];
        }
        arr[0]++;
        arr[1]++;
        return arr;
    }
    public static void main(String[] args){
    	int[] arr={-3,3,4,90};
    	Solution167 solution=new Solution167();
    	int[] res=solution.twoSum(arr,0);
    	for(int i=0;i<res.length;i++){
    		System.out.println(res[i]);
    	}
    }
}