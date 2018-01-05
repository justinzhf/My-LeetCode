public class Solution746 {
    public int minCostClimbingStairs(int[] cost) {
        //return climb(cost,cost.length);
        int[] minCost=new int[cost.length];
        minCost[0]=cost[0];
        minCost[1]=cost[1];
        for(int i=2;i<minCost.length;i++){
            int r1=cost[i]+minCost[i-1];
            int r2=cost[i]+minCost[i-2];
            minCost[i]=(r1<r2)?r1:r2;
        }
        int res1=minCost[cost.length-1];
        int res2=minCost[cost.length-2];
        return res1<res2?res1:res2;
    }
    private int climb(int[] cost,int endIndex){
        //TODO Dynamic Programming
        if(endIndex<=1){
            return 0;
        }
        int r1=cost[endIndex-1]+climb(cost,endIndex-1);
        int r2=cost[endIndex-2]+climb(cost,endIndex-2);
        return r1<r2?r1:r2;
    }
    public static void main(String[] args) {
        int[] cost={10,15,20};
        System.out.println(new Solution746().minCostClimbingStairs(cost));
    }
}
