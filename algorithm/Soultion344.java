import java.lang.*;
public class Solution344 {
    public String reverseString(String s) {
    	char[] temp1=s.toCharArray();
    	char[] temp2;
    	int length=temp1.length;
    	for(int i=0;i<length;i++){
    		temp2[i]=temp1[length-1-i];
    	}
    	return new String(temp2);

    }

    public static void main(String[] args){
    	String s="Hello";
    	Solution344 solution=new Solution344();
    	String rs=solution.reverseString(s);
    	System.out.println(rs);
    }
}