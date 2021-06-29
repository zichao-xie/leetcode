/**
 * 　　* @Description: 91. 解码方法
 * 　　* @author ZichaoXie
 * 　　* @date 2021/6/22 17:10
 *
 */
public class numDecodings {
    public static int numDecodings(String s) {
        if (s.startsWith("0"))
            return 0;
        int [] f = new int[s.length()];
        int [] t= new int[s.length()];
        f[0]=1;
        for (int i=1;i<s.length();i++){
            if (s.charAt(i)=='0'){
                if (s.charAt(i-1)=='1'||s.charAt(i-1)=='2'){
                    if (t[i-1]==1){
                        f[i-1]-=1;
                    }
                    f[i]=f[i-1];
                }else {
                    return 0;
                }
            }else {
                if (s.charAt(i-1)=='1'||(s.charAt(i-1)=='2'&&s.charAt(i)<'7')){
                    f[i]=f[i-1]+1;
                    t[i]=1;
                }else {
                    f[i]=f[i-1];
                }
            }
        }
        return f[s.length()-1];
    }

    public static void main(String[] args) {
        System.out.println(numDecodings("27"));
    }
}
