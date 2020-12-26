import java.util.Arrays;

public class threeSumClosest {
    public static int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0;i < nums.length - 2;i++){
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r){
                int sum = nums[i] + nums[l] + nums[r];
                //System.out.println(sum);
                if (sum > target){
                    if (diff > sum - target){
                        diff = sum - target;
                        res = sum;
                        //System.out.println(i+" "+l+" "+r+" "+diff);
                    }
                    r--;
                }else if (sum == target){
                    return target;
                }else {
                    if (diff > target - sum){
                        diff = target - sum;
                        res = sum;
                        //System.out.println(i+" "+l+" "+r+" "+diff+" x");
                    }
                    l++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-1,2,1,-4},1));
    }
}
