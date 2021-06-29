/**
 * 　　* @Description: 168. Excel表列名称
 * 　　* @author ZichaoXie
 * 　　* @date 2021/6/29 17:54
 *
 */
public class convertToTitle {
    /**
    　　* @Description: 进制转化，由于不是从1开始的，每次循环前要--。注意强制类型转换。
    　　* @author ZichaoXie
    　　* @date 2021/6/29 20:20
    　　*/
    public static String convertToTitle(int columnNumber) {
        StringBuffer stringBuffer = new StringBuffer();
        while (columnNumber>0){
            columnNumber--;
            stringBuffer.append((char) (columnNumber%26+'A'));
            columnNumber/=26;
        }
        return stringBuffer.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(26));
    }
}
