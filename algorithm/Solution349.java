import java.util.*;

public class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map map=new HashMap();
        for(int i=0;i< nums1.length;i++){
            if(((Integer)map.getOrDefault(nums1[i],0)==0)){
                map.put(nums1[i],1);
            }
        }
        for(int i=0;i<nums2.length;i++){
            int times=(Integer) map.getOrDefault(nums2[i],0);
            if(times==1){
                map.put(nums2[i],times+1);
            }

        }
        List list=new ArrayList();
        Set keys=map.keySet();
        for(Object key:keys){
            if((Integer)map.get(key)>=2){
                list.add(key);
            }
        }
        int[] interSection=new int[list.size()];
        for(int i=0;i<list.size();i++){
            interSection[i]=(int)list.get(i);
        }
        return interSection;
    }
    public static void main(String[] args) {
        int[] nums1={2,3},nums2={2,2,4};
        int[] res=new Solution349().intersection(nums1,nums2);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
