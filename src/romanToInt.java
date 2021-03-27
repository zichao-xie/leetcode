import java.util.HashMap;
import java.util.Map;

public class romanToInt {
    public static int romanToInt(String s){
        int res=0;
        Map<Character,Integer> map=new HashMap<Character, Integer>(){{
            put('I',1);
            put('V',5);
            put('X',10);
            put('L',50);
            put('C',100);
            put('D',500);
            put('M',1000);
//            put("IV",4);
//            put("IX",9);
//            put("XL",40);
//            put("XC",90);
//            put("CD",400);
//            put("CM",900);

        }};
        for (int i=0;i<s.length();i++){
            if (i!=s.length()-1)
                res=map.get(s.charAt(i))<map.get(s.charAt(i+1))?res-map.get(s.charAt(i)):res+map.get(s.charAt(i));
            else
                res+=map.get(s.charAt(i));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
