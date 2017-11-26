public class Solution598 {
    public int maxCount(int m, int n, int[][] ops) {
        int minIndex1=0,minIndex2=0;
        if(ops==null||ops.length<=0){
            return m*n;
        }
        for(int i=0;i<ops.length;i++){
            if(ops[i][0]<ops[minIndex1][0]){
                minIndex1=i;
            }
            if(ops[i][1]<ops[minIndex2][1]){
                minIndex2=i;
            }
        }

        return ops[minIndex1][0]*ops[minIndex2][1];
    }
    public static void main(String[] args) {
        int[][] ops={{2,2},{3,3}};
        System.out.println(new Solution598().maxCount(3,3,ops));
    }
}
