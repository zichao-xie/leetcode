

/**
 * @author ZichaoXie
 * @date 2021/8/3 下午5:30
 * @Description: 581. 最短无序连续子数组
 * @Times: 1
 */
public class findUnsortedSubarray {
    /**
     * @author  ZichaoXie
     * @date  2021/8/3 下午5:43
     * @description: 排序+双指针
     */

//    public static int findUnsortedSubarray(int[] nums) {
//        int []old = nums.clone();
//        Arrays.sort(nums);
//        int l = 0;
//        int r = nums.length-1;
//        while (l<=r&&old[l]==nums[l]) l++;
//        while (l<=r&&old[r]==nums[r]) r--;
//        return r-l+1;
//    }
    /**
     * @author  ZichaoXie
     * @date  2021/8/3 下午6:09
     * @description: 双指针+遍历
     *  在两侧找出递增的序列[0,i],[j,len-1]
     *  遍历[i-j],如果[x]比[i]小，需要重新设置i，找到比当前更小的值的i
     *  如果[i]比[j]大，需要重新设置j,找到比当前更大的值的j;
     */

    public static int findUnsortedSubarray(int[] nums){
        int l = 0;
        int r = nums.length-1;
        while (l<r&&nums[l]<=nums[l+1]) l++;
        while (l<r&&nums[r]>=nums[r-1]) r--;
        if (l==r)
            return 0;
        int ll=l;
        int rr=r;
        int min = nums[l];
        int max = nums[r];
        for (int i=ll;i<=rr;i++){
            if (nums[i]<min){
                while (l>=0&&nums[l]>nums[i]) l--;
                min = l>=0?nums[l]:Integer.MIN_VALUE;
            }
            if (nums[i]>max){
                while (r<=nums.length-1&&nums[i]>nums[r]) r++;
                max = r<=nums.length-1 ? nums[r]:Integer.MAX_VALUE;
            }
        }
        return r-1-l-1+1;
    }

    public static void main(String[] args) {
        System.out.println(findUnsortedSubarray(new int[]{1,2,3,4}));
    }
}
