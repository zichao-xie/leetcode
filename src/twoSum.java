import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static int [] twoSum(int [] nums,int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int tmp = target - nums[i];
            if (map.containsKey(tmp)){//判断当前数字与target的差是否存在，存在返回，不存在存入map
                return new int[]{i,map.get(tmp)};//新建一个数组赋初值并返回
            }
            map.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        twoSum(new int[]{4,88,1,90},89);
    }
}
