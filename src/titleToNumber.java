/**
 * @author ZichaoXie
 * @date 2021/7/30 下午5:45
 * @Description:
 * @Times: 1
 */
public class titleToNumber {
    public static int titleToNumber(String columnTitle) {
        int ret = 0;
        for (int i=0;i<columnTitle.length();i++){
            ret=ret*26+columnTitle.charAt(i)-'A'+1;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("FXSHRXW"));
    }
}
