import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class letterCombinations {

    public static List<String> letterCombinations(String digits) {
        Map<String,String> map=new HashMap<String, String>(){{
            put("1","!@#");
            put("2","abc");
            put("3","def");
            put("4","ghi");
            put("5","jkl");
            put("6","mno");
            put("7","pqrs");
            put("8","tuv");
            put("9","wxyz");
        }};
        List<String> list=new ArrayList<>();
        for (char c:digits.toCharArray()){
            String tmp = map.get(c+"");
            if (list.size() == 0){
                for (char c2:tmp.toCharArray()){
                    list.add(c2+"");
                }
                //res=list;
                continue;
            }
            List<String> res=new ArrayList<>();
            for (char c2:tmp.toCharArray()){
                for (int i=0;i<list.size();i++){
                    //list.set(i,list.get(i)+c2);
                    res.add(list.get(i)+c2);
                }
            }
            list=res;
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
