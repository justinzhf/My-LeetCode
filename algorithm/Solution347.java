import java.util.*;

public class Solution347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], (Integer) map.getOrDefault(nums[i], 0) + 1);
        }
        List result = new ArrayList();
        for(int i=0;i<k;i++){
            Object[] keys=map.keySet().toArray();
            Object maxKey=findMax(keys,map);
            result.add(maxKey);
            map.remove(maxKey);
            if(map.isEmpty()){
                break;
            }
        }
        return  result;

    }
    public Object findMax(Object[] nums,Map map){
        int maxIndex=0;
        for(int i=1;i<nums.length;i++){
            if((Integer)map.get(nums[maxIndex])<(Integer)map.get(nums[i])){
                maxIndex=i;
            }
        }
        return nums[maxIndex];
    }

    public static void main(String[] args) {
        int[] a = {4,1,-1,2,-1,2,3};
        System.out.println(new Solution347().topKFrequent(a, 7));
    }

}
