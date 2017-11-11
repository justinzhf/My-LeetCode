public class Solution461 {
    public int hammingDistance(int x, int y) {
        String res=Integer.toBinaryString(x^y);
        int count=0;
        for(int i=0;i<res.length();i++){
            if(res.charAt(i)=='1'){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(new Solution461().hammingDistance(1,4));


    }
}
