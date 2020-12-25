import java.util.Map;

public class longestCommonPrefix {
    public static String  longestCommonPrefix(String []strs){
        if (strs.length==0) return "";
        String str=strs[0];
        for (int i=0;i<strs.length;i++){
            int j=0;
            for (;j<str.length()&&j<strs[i].length();j++){
                if (str.charAt(j)!=strs[i].charAt(j))
                    break;
            }
            str=str.substring(0,j);
            if (str.length()==0)
                return str;
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}
