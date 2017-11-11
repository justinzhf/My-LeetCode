public class Solution657 {
    public boolean judgeCircle(String moves) {
        boolean isCircle=false;
        int xLen=0,yLen=0;
        for(int i=0;i<moves.length();i++){
            char move=moves.charAt(i);

            switch (move){
                case 'U':
                    yLen+=1;
                    break;
                case 'D':
                    yLen-=1;
                    break;
                case 'L':
                    xLen+=1;
                    break;
                case 'R':
                    xLen-=1;
                    break;
            }
        }
        if(xLen==0&&yLen==0){
            return true;
        }
        return  isCircle;
    }
    public static void main(String[] args) {

    }
}
