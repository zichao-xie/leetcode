/**
 * 　　* @Description: 121.买卖股票的最佳时机
 * 　　* @author ZichaoXie
 * 　　* @date 2021/3/30 22:41
 *
 */
public class maxProfit {
    public static int maxProfit(int[] prices) {
        int pre_min=prices[0];
        int ret_max=0;
        for (int i=1;i<prices.length;i++){
            pre_min=Math.min(prices[i],pre_min);
            ret_max=Math.max(prices[i]-pre_min,ret_max);
        }
        return ret_max;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1,7,8,5}));
    }
}
