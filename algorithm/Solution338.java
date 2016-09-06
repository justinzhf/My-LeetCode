import java.lang.*;
import java.math.*;
public class Solution338 {
    public int[] countBits(int num) {
    	int[] bits=new int[num+1];
    	int length;
    	for(int i=0;i<num+1;i++){
    		if(i>1){
    			length=Integer.toBinaryString(i).length();
    			bits[i]=1+bits[i-(int)Math.pow(2,length-1)];
    		}else if(i==0){
    			bits[0]=0;
    		}else if(i==1){
    			bits[1]=1;
    		}

    	}

        return bits;
    }

    public static void main(String[] args){
    	Solution338 solution=new Solution338();
    	int[] bits=solution.countBits(5);
    	for(int i=0;i<bits.length;i++){
    		System.out.println(bits[i]);
    	}
    }
}