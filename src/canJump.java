/**
 * 　　* @Description: 55. 跳跃游戏
 * 　　* @author ZichaoXie
 * 　　* @date 2021/6/24 15:41
 *
 */
public class canJump {
//    public static boolean canJump(int[] nums) {
//        int [] f = new int[nums.length];
//        f[0]=1;
//        for (int i=0;i<nums.length;i++){
//            if (f[i]==1){
//                for (int j=i+1;j<=i+nums[i]&&j<nums.length;j++){
//                    if (f[j]==0){
//                        f[j]=1;
//                    }
//                }
//            }
//        }
//        return f[nums.length-1]==1?true:false;
//    }

    public static boolean canJump(int [] nums){
        int right=0;
        for (int  i=0;i<nums.length;i++){
            if (right<i)
                return false;
            right=Math.max(right,i+nums[i]);
        }
        return right>=nums.length-1?true:false;
    }

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{0}));
    }
}
