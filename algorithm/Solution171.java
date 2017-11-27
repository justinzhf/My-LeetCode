public class Solution171 {
    public int titleToNumber(String s) {
        if(s==null)return 0;
        int det=(int)'A'-1;
        int num=0;
        int length=s.length();
        for(int i=0;i<length;i++){
            num+=(s.charAt(i)-det)*Math.pow(26,length-i-1);
        }
        return num;

    }
    public static void main(String[] args) {
        System.out.println(new Solution171().titleToNumber(""));
    }
}
