/**
 * 　　* @Description: 136.只出现一次的数字
 * 　　* @author ZichaoXie
 * 　　* @date 2021/3/30 23:03
 *
 */
public class singleNumber {
    public static int singleNumber(int[] nums) {
        for (int i=1;i<nums.length;i++){
            nums[i]^=nums[i-1];
        }
        return nums[nums.length-1];
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1,2,1,2,3}));
    }
}
