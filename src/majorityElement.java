/**
 * 　　* @Description:
 * 　　* @author ZichaoXie
 * 　　* @date 2021/4/6 23:03
 *
 */
public class majorityElement {
    /**
    　　* @Description: 1.排序取中值
     2.哈希
    　　* @author ZichaoXie
    　　* @date 2021/4/6 23:09
    　　*/
    public static int majorityElement(int[] nums) {
        int ret=nums[0];
        int count = 1;
        for (int i=1;i<nums.length;i++){
            if (nums[i] == ret){
                count++;
            }else if (count == 1){
                ret=nums[i];
            }else {
                count--;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,1,2,2,2,3}));
    }
}
