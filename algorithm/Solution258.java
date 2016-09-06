public class Solution258 {
    public int addDigits(int num) {
        while(num>=10){
        	int d=10,r=0;
	        while(num!=0){
	        	r+=num%d;
	        	num/=d;
	        }	
	        num=r;
        }
        return num;
    }
    public static void main(String[] args){
    	Solution258 solution=new Solution258();
    	System.out.println(solution.addDigits(0));
    }
} 