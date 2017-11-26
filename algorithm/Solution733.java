public class Solution733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int left=sc-1,right=sc+1,up=sr-1,down=sr+1;
        int oldColor=image[sr][sc];
        if(image==null){
            return null;
        }
        if(oldColor==newColor){
            return image;
        }

        image[sr][sc]=newColor;
        if(left>=0&&image[sr][left]==oldColor){
            floodFill(image,sr,left,newColor);
        }
        if(right<image[0].length&&image[sr][right]==oldColor){
            floodFill(image,sr,right,newColor);
        }
        if(up>=0&&image[up][sc]==oldColor){
            floodFill(image,up,sc,newColor);
        }
        if(down<image.length&&image[down][sc]==oldColor){
            floodFill(image,down,sc,newColor);
        }
        return image;
    }
    public static void main(String[] args) {
        int[][] image= {{0,0,0},{0,1,1}};
        image=new Solution733().floodFill(image,1,1,1);
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                System.out.print(image[i][j]+",");
            }
            System.out.println();
        }
    }
}
