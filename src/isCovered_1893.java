

/**
 * @author ZichaoXie
 * @date 2021/7/23 下午6:06
 * @Description:给你一个二维整数数组 ranges 和两个整数 left 和 right 。每个 ranges[i] = [starti, endi] 表示一个从 starti 到 endi 的 闭区间 。
 *
 * 如果闭区间 [left, right] 内每个整数都被 ranges 中 至少一个 区间覆盖，那么请你返回 true ，否则返回 false 。
 *
 * 已知区间 ranges[i] = [starti, endi] ，如果整数 x 满足 starti <= x <= endi ，那么我们称整数x 被覆盖了。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/check-if-all-the-integers-in-a-range-are-covered
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class isCovered_1893 {
//    public boolean isCovered(int[][] ranges, int left, int right) {
//        List list = new ArrayList<>();
//        for (int i=0;i<ranges.length;i++){
//            for (int j=ranges[i][0];j<=ranges[i][1];j++){
//                if (!list.contains(j)){
//                    list.add(j);
//                }
//            }
//        }
//        for (int i=left;i<=right;i++){
//            if (!list.contains(i)){
//                return false;
//            }
//        }
//        return true;
//    }
    /**
     * @author  ZichaoXie
     * @date  2021/7/23 下午6:36
     * @description:差分数组
     * 对于ranges中的数组，创建数组diff，起始处标1，末尾后一位标-1.
     * 求diff的前缀和。diff[i]>0,被覆盖，否则不被覆盖。
     */

    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] diff = new int[52];
        for (int i = 0; i < ranges.length; i++) {
            diff[ranges[i][0]]++;
            diff[ranges[i][1] + 1]--;
        }
        for (int i = 1; i < 52; i++) {
            diff[i] += diff[i - 1];
        }
        for (int i = left; i <= right; i++) {
            if (diff[i] <= 0)
                return false;
        }
        return true;
    }
}