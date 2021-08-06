/**
 * 　　* @Description: 67. 二进制求和
 * 　　* @author ZichaoXie
 * 　　* @date 2021/6/29 17:21
 *    * @times 1
 *
 */
public class addBinary {
    /**
    　　* @Description:
    　　* @author ZichaoXie
    　　* @date 2021/6/29 17:48
    　　*/
    public String addBinary(String a, String b) {
        StringBuffer stringBuffer = new StringBuffer();
        //找出较长的长度用于遍历
        int len = Math.max(a.length(),b.length());
        //记录进位
        int carry = 0;
        for (int i=0;i<len;i++){
            //如果a未遍历完，则去相应位置上的数字加到进位上，否则取0；
            carry+= (i<a.length()?(a.charAt(a.length()-1-i)-'0'):0);
            carry+= (i<b.length()?(b.charAt(b.length()-1-i)-'0'):0);
            //加到字符串末尾。
            stringBuffer.append(carry%2);
            carry/=2;
        }
        //遍历完仍有进位
        if (carry>0)
            stringBuffer.append(carry);
        //返回倒序的字符串。
        return stringBuffer.reverse().toString();
    }
}
