/**
 * 　　* @Description: 633. 平方数之和
 * 　　* @author ZichaoXie
 * 　　* @date 2021/4/28 17:43
 *
 */
public class judgeSquareSum {
    public static boolean judgeSquareSum(int c) {
        int low = 0;
        int high = (int) Math.sqrt(c);
        while (low<=high){
            int sum = (int) Math.pow(low,2)+ (int) Math.pow(high,2);
            if (sum<c){
                low++;
            }else if (sum > c){
                high--;
            }else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(8));
    }
}
