public class Solution477 {
    public int totalHammingDistance(int[] nums) {
        int total=0;
        for(int i=1;i<=32;i++){
            int bitCount=0;
            for(int j=0;j<nums.length;j++){
                bitCount+=(nums[j]>>i)&1;
            }
            total+=bitCount*(nums.length-bitCount);
        }
        return total;
    }


    public static void main(String[] args) {
        int[] a={4,14,2};
        System.out.println(new Solution477().totalHammingDistance(a));
    }
}
