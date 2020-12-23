import java.util.ArrayList;
import java.util.List;

public class convert
{
//    public static String convert(String s, int numRows) {
//        if (numRows<2)  return s;
//        List<StringBuilder> list = new ArrayList<>();
//        for (int i=0;i<numRows;i++){
//            list.add(new StringBuilder());
//        }
//        int flag=-1;
//        int i=0;
//        for (char c:s.toCharArray()){
//            list.get(i).append(c);
//            if (i==0||i==numRows-1)   flag=-flag;
//            i+=flag;
//        }
//        StringBuilder res=new StringBuilder();
//        for (StringBuilder sb:list){
//            res.append(sb);
//        }
//        return res.toString();
//    }

    public static String convert(String s, int numRows) {
        if (numRows<2) return s;
        List<StringBuilder> list=new ArrayList<>();
        for (int i=0;i<numRows;i++){
            list.add(new StringBuilder());
        }
        int flag=-1;
        int i=0;
        for(char c:s.toCharArray()){
            list.get(i).append(c);
            if (i==0||i==numRows-1) flag=-flag;
            i+=flag;
        }
        StringBuilder res=new StringBuilder();
        for (StringBuilder stringBuilder:list){
            res.append(stringBuilder);
        }
        return res.toString();
    }


    public static void main(String[] args) {

    }
}
