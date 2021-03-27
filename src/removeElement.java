/**
 * 　　* @Description: 给你一个数组 nums和一个值 val，你需要原地移除所有数值等于val的元素，并返回移除后数组的新长度。
        * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
        * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
        * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/remove-element 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 　　* @author ZichaoXie
 * 　　* @date 2021/3/28 1:45
 *
 */
public class removeElement {
    /**
    　　* @Description: 首尾双指针
                        前指针值等于val与后指针值交换，后指针前移
                                不等，前指针后移。
    　　* @author ZichaoXie
    　　* @date 2021/3/28 2:01
    　　*/
    public static int removeElement(int[] nums, int val) {
        if (nums.length==0||nums==null){
            return 0;
        }

        int p=0;
        int q=nums.length-1;
        while (q>p){
            if (nums[p]==val){
                nums[p]=nums[q];
                q--;
            }else {
                p++;
            }
        }
        if (nums[p]==val){//判断最后一个数字是否为val！！！！！！
            return p;
        }
        return p+1;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,3},3));

    }
}
