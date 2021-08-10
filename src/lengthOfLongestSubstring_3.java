import java.util.HashMap;
import java.util.Map;
//time 3

public class lengthOfLongestSubstring_3 {
    /**
    　　* @Description: hash
            使用head保留当前最长不重复子串的头，
            每次遍历到一个字符，判断map中是否含有当前字符。
            如果含有，判断之前的字符在head之前还是之后。
            之前的，head不变
            之后的，head变为上次重复字符的下标的下一个。
            判断是否产生了更大的max值，将当前字符压入map
    　　* @author ZichaoXie
    　　* @date 2021/8/6 18:43
    　　*/
    public static int lengthOfLongestSubstring(String s){
        if (s.length()==0){
            return 0;
        }
        int head = 0;
        int max = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (int  i=0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))){
                head = Math.max(head,map.get(s.charAt(i))+1);
            }
            max = Math.max(max,i-head+1);
            map.put(s.charAt(i),i);
        }
        return max;
    }

    public static void main(String[] args) {

    }

//    if (s.length()==0)
//            return 0;
//    Map<Character,Integer> map=new HashMap<>();
//    int head=0;
//    int max=0;
//        for (int i=0;i<s.length();i++){
//        if (map.containsKey(s.charAt(i))){
//            head=Math.max(head,map.get(s.charAt(i))+1);//!!
//        }
//        map.put(s.charAt(i),i);
//        max=Math.max(max,i-head+1);
//    }
//        return max;
}
