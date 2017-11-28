import java.util.Arrays;

public class Solution453 {
    public int minMoves(int[] nums) {
        int times=0;
        Arrays.sort(nums);
        int maxIndex=nums.length-1;
        int t=nums[maxIndex]-nums[0];
        while (maxIndex>=1){
            times+=t;
            maxIndex--;
            t=nums[maxIndex]-nums[0];
        }
        return times;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        System.out.println(new Solution453().minMoves(a));
    }
}
