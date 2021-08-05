import java.util.Arrays;

/**
 * @author ZichaoXie
 * @date 2021/8/4 下午5:46
 * @Description: 611. 有效三角形的个数
 * @Times: 1
 */
public class triangleNumber {

//    public static int triangleNumber(int[] nums) {
//        if (nums.length<3){
//            return 0;
//        }
//        Arrays.sort(nums);
//        int l = 0;
//        int r = nums.length-1;
//        int m = r-1;
//        int ret = 0;
//        while (r>1){
//            while (l<r-1){
//                if (nums[l]+nums[m]>nums[r]&&l!=m){
////                    System.out.println(l+""+m+""+r);
//                    ret++;
//                    m--;
//                }else {
//                    l++;
//                    m=r-1;
//                }
//            }
//            l=0;
//            r--;
//            m=r-1;
//        }
//        return ret;
//    }

    /**
     * @author  ZichaoXie
     * @date  2021/8/5 下午4:11
     * @description: 固定一条边，寻找另外两条边
     */
    public static int triangleNumber(int[] nums){
        Arrays.sort(nums);
        int ret = 0;
        int len = nums.length;
        for (int i=0;i<len;i++){
            int r = i+2;
            for (int j=i+1;j<len;j++){
                int l = j+1;
                while (r<len&&nums[i]+nums[j]>nums[r]) r++;
                ret+=Math.max(r-l,0);
            }
        }
        return ret;
    }
//2,3,4,4
    public static void main(String[] args) {
        System.out.println(triangleNumber(new int[] {1,1,2,3,4}));
    }
}
