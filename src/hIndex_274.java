import java.util.Arrays;

/**
 * @author ZichaoXie
 * @date 2021/7/13 下午3:50
 * @Description:
 */
public class hIndex_274 {
    /**
     * @author  ZichaoXie
     * @date  2021/7/13 下午3:59
     * @description:快排
     */

    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int ret = 0;
        for (int  i=citations.length-1;i>=0;i--){
            if (citations[i]>ret){
                ret++;
            }else {
                return ret;
            }
        }
        return ret;
    }

    /**
     * @author  ZichaoXie
     * @date  2021/7/13 下午4:11
     * @description:基数排序。记录每个引用的数量。从后往前遍历找到符合条件的h。
     */

    public static int hIndex2(int[] citations) {
        int [] nums = new int[citations.length+1];
        for (int i=0;i<citations.length;i++){
            if (citations[i]>citations.length){
                nums[citations.length]++;
            }else {
                nums[citations[i]]++;
            }
        }
        int ret=0;
        for (int i=citations.length;i>=0;i--){
            ret+=nums[i];
            if (ret>=i) {
                return i;
            }
        }
        return 0;
    }



    public static void main(String[] args) {
        System.out.println(hIndex2(new int[]{1,3,1}));
    }
}
