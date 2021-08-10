/**
 * @author ZichaoXie
 * @date 2021/8/10 下午5:13
 * @Description: 413. 等差数列划分
 * @Times: 1
 */
public class numberOfArithmeticSlices {
    public int numberOfArithmeticSlices(int[] nums) {
        int len = nums.length;
        int ans = 0;
        for (int i=0;i<len-2;){
            int j = i, d = nums[j+1]-nums[j];
            while (j<len-1&&nums[j+1]-nums[j]==d) j++;

            int l = j-i+1;

            int l1 = 1,l3 = l-2;

            int tmp = (l1+l3)*l3/2;
            ans+=tmp;
            i=j;
        }
        return ans;
    }
}
