import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s){
        if (s.length()==0)
            return 0;
        int head=0;
        int max=0;
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))){
                head=Math.max(head,map.get(s.charAt(i))+1);
            }
            max=Math.max(max,i-head+1);
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
