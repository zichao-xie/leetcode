import java.util.HashMap;
import java.util.Map;

public class countPairs1711 {
    /**
     * @author  ZichaoXie
     * @date
     * description:先遍历数组，找出最大的数字，和最大为最大数字的两倍。
     * 外层遍历数组，内层遍历从1到最大和之间的2的幂。查找哈希表里面有没有差。
     * 将该数字加入到哈希表中。
     */



    public int countPairs(int[] deliciousness) {
        int mod = 1000000007;
        int maxValue = 0;
        for (int i: deliciousness) {
            maxValue = Math.max(i,maxValue);
        }
        int maxSum = maxValue*2;
        int pairs = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int val : deliciousness) {
            for (int sum = 1; sum < maxSum; sum *= 2) {
                int count = map.getOrDefault(sum-val, 0);
                pairs = (pairs + count) % mod;
            }
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        return pairs;
    }
}
