/**
 * @author ZichaoXie
 * @date 2021/7/15 下午6:58
 * @Description:给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 */
public class isPalindrome_125 {
//    public static boolean isPalindrome(String s) {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i=0;i<s.length();i++){
//            if (Character.isLetterOrDigit(s.charAt(i))){
//                stringBuilder.append(Character.toLowerCase(s.charAt(i)));
//            }
//        }
//
//        StringBuilder stringBuilder1 = new StringBuilder(stringBuilder).reverse();
//        return stringBuilder1.toString().equals(stringBuilder.toString())? true:false;
//    }
    public static boolean isPalindrome(String s){
        int l=0,r=s.length()-1;
        while (l<r){
            while (l<r&&!Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }
            while (l<r&&!Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }
            if (l<r){
                if (Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))){
                    return false;
                }
                l++;
                r--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Aab aa"));
    }
}
