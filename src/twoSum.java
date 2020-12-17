import java.awt.print.PrinterGraphics;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static int [] twoSum(int [] nums,int target){
        Map<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int tmp=target-nums[i];
            if (map.containsKey(tmp)){
                return new int[]{map.get(tmp),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        twoSum(new int[]{4,88,1,90},89);
    }

}
