import java.util.HashMap;
import java.util.Map;

public class twoSum {
    /**
    　　* @Description: hash,判断map里是否含有target-num[i]
    　　* @author ZichaoXie
    　　* @date 2021/8/6 18:35
       * @times 2
    　　*/
    public static int [] twoSum(int [] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int  i=0;i<nums.length;i++){
            if (map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }else {
                map.put(nums[i],i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        twoSum(new int[]{4,88,1,90},89);
    }
}
