/**
 * 　　* @Description: 实现strStr()函数。
 * 给定一个haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回 -1。
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/implement-strstr 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 　　* @author ZichaoXie
 * 　　* @date 2021/3/28 2:30
 *
 */
public class strStr {
    /**
    　　* @Description:KMP OR indexOf???
    　　* @author ZichaoXie
    　　* @date 2021/3/28 2:43
    　　*/
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
