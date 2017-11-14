public class Solution556 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int originRow=nums.length;
        int originCol=0;
        if(originRow>0){
            originCol=nums[0].length;
        }

        if(originCol*originRow!=r*c){
            return nums;
        }

        int[][] newNums=new int[r][c];
        int rowIndex=0;
        int colIndex=0;
        for(int i=0;i<originRow;i++){
            for(int j=0;j<originCol;j++){
                newNums[rowIndex][colIndex]=nums[i][j];
                colIndex++;
                if(colIndex>=c){
                    rowIndex++;
                    colIndex=0;
                }
            }
        }
        return  newNums;


    }
    public static void main(String[] args) {
        int[][] nums={{1,2},{3,4}};
        System.out.println(nums);
    }
}
