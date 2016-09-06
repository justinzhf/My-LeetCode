public class Solution389 {
    public char findTheDifference(String s, String t) {
        char[] sc=s.toCharArray();
        char[] tc=t.toCharArray();
        int sum=0;
        for(int i=0;i<sc.length;i++){
        	sum^=sc[i];
        }
        for(int i=0;i<tc.length;i++){
        	sum^=tc[i];
        }
        return (char)sum;
    }
    public static void main(String[] args) {
    		Solution389 sl=new Solution389();
    		String s="";
    		String t="e";
    		System.out.println(sl.findTheDifference(s,t));
    }
}