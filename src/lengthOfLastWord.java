/**
 * 　　* @Description: 58.最后一个单词的长度
 * 　　* @author ZichaoXie
 * 　　* @date 2021/3/30 23:48
 *
 */
public class lengthOfLastWord {
    public static int lengthOfLastWord(String s) {
//        int ret=0;
//        int len=0;
//        for (int i=0;i<s.length();i++){
//            if (s.charAt(i)==' '){
//                ret=len==0?ret:len;
//                len=0;
//            }else {
//                len++;
//            }
//        }
//        if (len!=0){
//            ret=len;
//        }
//        return ret;
        int count=0;
        //从后往前遍历
        for (int i=s.length()-1;i>=0;i--){
            if (s.charAt(i)==' '){
                //"a  "的情况，最后连续多个空格
                if (count==0){
                    continue;
                }else {
                    return count;
                }
            }else {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a  "));
    }
}
