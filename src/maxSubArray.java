/**
 * 　　* @Description: 53.最大子序和
 *        给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），
 *        返回其最大和。
 * 　　* @author ZichaoXie
 * 　　* @date 2021/3/29 22:50
 *
 */
public class maxSubArray {
    public static int maxSubArray(int[] nums) {
//        int [] dp=new int[nums.length+1];//做麻烦啦
//        dp[0]=nums[0];
//        int ret=dp[0];
//        for (int i=1;i<nums.length;i++){
//            dp[i]= Math.max(dp[i-1]+nums[i],nums[i]);
//            if (ret<dp[i]){
//                ret=dp[i];
//            }
//        }
//        return ret;
        int ret=nums[0];
        int sum=0;//不需要使用dp[]
        for (int num:nums){
            if (sum>0){
                sum+=num;
            }else {
                sum=num;
            }
            ret = Math.max(ret,sum);
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-1,-5}));
    }
}
