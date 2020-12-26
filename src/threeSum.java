import java.lang.reflect.Array;
import java.util.*;

//15.三数之和
public class threeSum {
    public static List<List<Integer>> threeSum(int[] nums){
        if (nums.length<3){
            return new ArrayList<>();
        }
        List<List<Integer>> lists=new ArrayList<>();
        //升序
        Arrays.sort(nums);
        // Arrays.sort(nums,Collections.reverseOrder());降序

        for (int i=0;i<nums.length-2&&nums[i]<=0;i++){

            //避免出现重复解
            if (i>0 && nums[i]==nums[i-1]){
                continue;
            }

            int left=i+1;
            int right=nums.length-1;

            while (left<right){
                int sum = nums[i]+nums[left]+nums[right];
                List list=new ArrayList();
                if (sum == 0){
                    //aslist函数
                    lists.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while (left < right && nums[left] == nums[left+1]){
                        left++;
                    }
                    while (left < right && nums[right] == nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }else if (sum > 0){
                    right--;
                }else {
                    left++;
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        //System.out.println(threeSum());;
    }
}

class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1,Integer o2){
        return o2-o1;
    }
}