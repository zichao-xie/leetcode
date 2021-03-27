/**
 * 　　* @Description: 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。  不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。  来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 　　* @author ZichaoXie
 * 　　* @date 2021/3/28 1:31
 *
 */
public class removeDuplicates {
    /**
    　　* @Description: 双指针,快指针向后遍历，与前指针相同则继续向后；
                        与前指针不同则将前指针的下一位变为前指针的数字
    　　* @author ZichaoXie
    　　* @date 2021/3/28 1:43
    　　*/
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length==0) {
            return 0;
        }
        int p=0;
        int q=p+1;
        while (q<nums.length){
            if (nums[p]!=nums[q]){
                nums[p+1]=nums[q];
                p++;
            }
            q++;
        }
        return p+1;
    }
}
