import java.util.ArrayList;
import java.util.List;

public class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        backTrack(res,"",0,0,n);
        return res;
    }
    private void backTrack(List<String> res,String str,int open,int close,int max){
        if(str.length()==2*max){
            res.add(str);
            return;
        }
        if(open<max){
            backTrack(res,str+"(",open+1,close,max);
        }
        if(open>close){
            backTrack(res,str+")",open,close+1,max);
        }
    }
    public static void main(String[] args) {
        int n=2;
        new Solution22().generateParenthesis(n);
    }
}
