import java.util.ArrayList;
import java.util.List;

/**
 * @author ZichaoXie
 * @date 2021/7/16 下午5:52
 * @Description:给你一个字符串 s，请你对 s 的子串进行检测。
 *
 * 每次检测，待检子串都可以表示为 queries[i] = [left, right, k]。我们可以 重新排列 子串 s[left], ..., s[right]，并从中选择 最多 k 项替换成任何小写英文字母。 
 *
 * 如果在上述检测过程中，子串可以变成回文形式的字符串，那么检测结果为 true，否则结果为 false。
 *
 * 返回答案数组 answer[]，其中 answer[i] 是第 i 个待检子串 queries[i] 的检测结果。
 *
 * 注意：在替换时，子串中的每个字母都必须作为 独立的 项进行计数，也就是说，如果 s[left..right] = "aaa" 且 k = 2，我们只能替换其中的两个字母。（另外，任何检测都不会修改原始字符串 s，可以认为每次检测都是独立的）
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/can-make-palindrome-from-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class canMakePaliQueries_1177 {
    public static List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        int cur = 0;
        int [] status = new int[s.length()];
        for (int i=0;i<s.length();i++){
            /*
            * status用于存储当前字符串之前（包括当前字符串）所有字符是否出现了单数次*/
            cur^=1<<(s.charAt(i)-'a');
            status[i]=cur;
        }
        List<Boolean> result = new ArrayList<>();
        for (int i=0;i<queries.length;i++){
            //因为status存储的包含当前字符，所以索引要减一才是前当前字符串之前所有字符的状态。
            int ostate = queries[i][0]==0?0:status[queries[i][0]-1];
            //只有某个字符仅基数次出现在首字符之前的字符串或尾字符之前的字符串中才会基数次出现在待检测的字符串中。
            int state = ostate ^ status[queries[i][1]];
            int cnt = 0;
            //统计出现基数次的字符串
            while (state!=0){
                if ((state & 1)==1){
                    cnt++;
                }
                state>>=1;
            }

            result.add(cnt/2 <= queries[i][2]);
        }
        return  result;
    }

    public static void main(String[] args) {
        //canMakePaliQueries("abcda",new int[][]{{3,3,0},{1,2,0},{0,3,1},{0,3,2},{0,4,1}});
    }
}
