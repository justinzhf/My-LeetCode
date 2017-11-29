import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map map1=new HashMap();
        Map map2=new HashMap();
        for(int i=0;i<ransomNote.length();i++){
            map1.put(ransomNote.charAt(i),(Integer)map1.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        for(int i=0;i<magazine.length();i++){
            map2.put(magazine.charAt(i),(Integer)map2.getOrDefault(magazine.charAt(i),0)+1);
        }
        Set keys=map1.keySet();
        for(Object key:keys){
            Integer times1=(Integer) map1.get(key);
            Integer times2=(Integer) map2.getOrDefault(key,0);
            if(times1>times2){
                return  false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String a="aaa",b="ababab";
        System.out.println(new Solution383().canConstruct(a,b));
    }
}
