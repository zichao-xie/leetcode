/**
 * 　　* @Description: 45. 跳跃游戏 II
 * 　　* @author ZichaoXie
 * 　　* @date 2021/6/24 15:52
 *
 */
public class jump {
//    public static int jump(int[] nums) {
//        int [] dp = new int[nums.length];
//        for (int i=0;i<nums.length;i++){
//            for (int j=i+1;j<=i+nums[i]&&j<nums.length;j++){
//                if (dp[j]==0){
//                    dp[j]=dp[i]+1;
//                }else if (dp[j]>dp[i]+1){
//                    dp[j]=dp[i]+1;
//                }
//            }
//        }
//        return dp[nums.length-1];
//    }
    public static int jump(int[] nums){
        int res=0;
        int end=0;
        int right=0;
        for (int i=0;i<nums.length-1;i++){
            right=Math.max(right,i+nums[i]);
            if (i==end){
                end=right;
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(jump(new int[]{1,1,1,1,3}));
    }
}
