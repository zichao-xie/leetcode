import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s){
        if (s.length()==0){//s为空，直接返回
            return 0;
        }
        int head=0;//无重复子串的开始下标
        int max=0;
        Map<Character, Integer> map=new HashMap<>();
        for (int i=0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))){//如果当前字符已经出现，在head之前则不用变，在head之后变为上一个下标+1。
                head=Math.max(head,map.get(s.charAt(i))+1);//
            }
            map.put(s.charAt(i),i);
            max=Math.max(max,i-head+1);//以当前节点为最后一个字符的最长长度与当前的最长长度比较
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
