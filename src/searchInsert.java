/**
 * 　　* @Description: 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
                    * 你可以假设数组中无重复元素。
 * 　　* @author ZichaoXie
 * 　　* @date 2021/3/28 2:19
 *
 */
public class searchInsert {
    public int searchInsert(int[] nums, int target) {
        if (nums==null){
            return  0;
        }
        int i=0;
        while (i<nums.length&&nums[i]<target){//判断数组中最大的数字都没有target大，否则会越界。
            if (nums[i]==target){
                return i;
            }
            i++;
        }
        return i;
    }
}
