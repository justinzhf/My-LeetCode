import java.util.ArrayList;
import java.util.List;

public class Solution412 {

    public List<String> fizzBuzz(int n) {
        List mList=new ArrayList();
        for(int i=1;i<=n;i++){
            if((i%3==0)&&(i%5==0)){
                mList.add("FizzBuzz");
            }else if (i%3==0){
                mList.add("Fizz");
            }else if(i%5==0){
                mList.add("Buzz");
            }else {
                mList.add(i+"");
            }
        }
        return mList;

    }
    public static void main(String[] args) {

    }

}
