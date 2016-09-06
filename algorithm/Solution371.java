public class Solution371 {
    public int getSum(int a, int b) {
        int c=a^b;
        int d=a&b;
        System.out.println("c:"+c+"    "+"d:"+d);
        int sum=c;
        while(d!=0){
        	sum=c^(d<<1);
        	d=c&(d<<1);
        	c=sum;
        }
        return sum;
    }
    public static void main(String[] args){
    	int a=1,b=2;
    	Solution371 solution=new Solution371();
    	System.out.println(solution.getSum(a,b));
    }
}