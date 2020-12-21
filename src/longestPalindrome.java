public class longestPalindrome {
    public static String longestPalindrome(String s) {
        if (s.length()==0)
            return null;
        String res="";
        for (int i=0;i<s.length();i++){
            String tmp="";
            for (int j=0;i-j>=0&&i+j<s.length();j++){
                if (s.charAt(i-j)==s.charAt(i+j)){
                    if (j==0){
                        tmp=s.charAt(i)+"";
                        if (res.length()==0)
                            res=tmp;
                    }else if (s.charAt(i-j)==s.charAt(i+j)){
                        tmp=s.charAt(i-j)+tmp+s.charAt(i+j);
                        if (tmp.length()>res.length())
                            res=tmp;
                    }else{
                        break;
                    }
                }else{
                    break;
                }

            }
        }
        for (int i=0;i<s.length();i++){
            String tmp="";
            for (int j=0;i-j>=0&&i+j+1<s.length();j++){
                if (s.charAt(i-j)==s.charAt(i+j+1)){
                    tmp=s.charAt(i-j)+tmp+s.charAt(i+j+1);
                    if (tmp.length()>res.length()){
                        res=tmp;
                    }
                }else{
                    break;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(longestPalindrome("aacabdkacaa"));
    }
}
