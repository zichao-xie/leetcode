import java.util.Arrays;

/**
 * @author ZichaoXie
 * @date 2021/7/14 下午5:08
 * @Description:给你两个正整数数组 nums1 和 nums2 ，数组的长度都是 n 。
 *
 * 数组 nums1 和 nums2 的 绝对差值和 定义为所有 |nums1[i] - nums2[i]|（0 <= i < n）的 总和（下标从 0 开始）。
 *
 * 你可以选用 nums1 中的 任意一个 元素来替换 nums1 中的 至多 一个元素，以 最小化 绝对差值和。
 *
 * 在替换数组 nums1 中最多一个元素 之后 ，返回最小绝对差值和。因为答案可能很大，所以需要对 109 + 7 取余 后返回。
 *
 * |x| 定义为：
 *
 * 如果 x >= 0 ，值为 x ，或者
 * 如果 x <= 0 ，值为 -x
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-absolute-sum-difference
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class minAbsoluteSumDiff_1818 {
    /**
     * @author  ZichaoXie
     * @date  2021/7/14 下午5:08
     * @description:
     */
    
    public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int mod = 1000000007;
        int len = nums1.length;
        int [] sorted = nums1.clone();
        Arrays.sort(sorted);
        long sum = 0;
        long max = 0;
        for (int i=0;i<len;i++){
            int a = nums1[i];
            int b = nums2[i];
            if (a==b)
                continue;
            sum=(sum+Math.abs(a-b))%mod;

            int l=0,r=len-1;
            while (l<r){
                int mid = (l+r)/2;
                if (b<nums1[mid])
                    r =mid-1;
                else
                    l= mid;
            }
            max=Math.max(max,Math.abs(sorted[l]-nums2[i]));
            if (l>0) {
                max = Math.max(max, Math.abs(sorted[l - 1] - nums2[i]));
            }
        }
        return (int)(sum-max)%mod;
    }

    public static void main(String[] args) {
        System.out.println(minAbsoluteSumDiff(new int[]{1,7,5},new int[]{2,3,5}));
        System.out.println(minAbsoluteSumDiff(new int[]{2,4,6,8,10},new int[]{2,4,6,8,10}));
        System.out.println(minAbsoluteSumDiff(new int[]{1,10,4,4,2,7},new int[]{9,3,5,1,7,4}));
    }
}
