import java.util.HashMap;
import java.util.Map;

public class Solution575 {
    public int distributeCandies(int[] candies) {
        Map map=new HashMap();

        for(int i=0;i<candies.length;i++){
            map.put(candies[i],"");
        }
        int kind=map.size();
        int number=candies.length/2;
        if(kind<number){
            return kind;
        }else {
            return  number;
        }



    }
    public static void main(String[] args) {
        int[] candies={1,1,2,3};


        System.out.println(new Solution575().distributeCandies(candies));
    }
}
