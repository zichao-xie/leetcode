import java.util.Arrays;

/**
 * @author ZichaoXie
 * @date 2021/8/4 下午5:46
 * @Description: 611. 有效三角形的个数
 * @Times: 1
 */
public class triangleNumber {
    public static int triangleNumber(int[] nums) {
        if (nums.length<3){
            return 0;
        }
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length-1;
        int m = r-1;
        int ret = 0;
        while (r>1){
            while (l<r-1){
                if (nums[l]+nums[m]>nums[r]){
                    System.out.println(l+""+m+""+r);
                    ret++;
                    m--;
                }else {
                    l++;
                    m=r-1;
                }
            }
            l=0;
            r--;
            m=r-1;
        }
        return ret;
    }
//2,3,4,4
    public static void main(String[] args) {
        System.out.println(triangleNumber(new int[] {4,2,3,4}));
    }
}
