import java.util.*;

/**
 * 　　* @Description: 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *          有效字符串需满足：  左括号必须用相同类型的右括号闭合。 左括号必须以正确的顺序闭合。
 *          来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/valid-parentheses 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 　　* @author ZichaoXie
 * 　　* @date 2021/3/18 23:16
 *
 */
public class isValid {

    /**
    　　* @Description:
    　　* @author ZichaoXie
    　　* @date 2021/3/18 23:21
    　　*/
    public boolean isValid(String s) {
        Map<Character,Character> map=new HashMap(){{
            put(')', '(');
            put('}', '{');
            put(']', '[');
        }};
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (map.containsKey(ch)){
                if (stack.isEmpty()||map.get(ch)!=stack.peek()){
                    return false;
                }
                stack.pop();
            }else {
                stack.add(ch);
            }
        }
        return stack.isEmpty();
//        Stack<Character> stack = new Stack();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{') {
//                stack.add(s.charAt(i));
//            } else if (stack.isEmpty()) {
//                return false;
//            } else if (s.charAt(i) == ']' && stack.pop() != '[') {//这里可以用map存储
//                return false;
//            } else if (s.charAt(i) == ')' && stack.pop() != '(') {
//                return false;
//            } else if (s.charAt(i) == '}' && stack.pop() != '{') {
//                return false;
//            }
//        }
//        if (stack.isEmpty()) {
//            return true;
//        }
//        return false;
    }
}
