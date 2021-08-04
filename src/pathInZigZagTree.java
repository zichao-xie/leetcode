import java.util.ArrayList;
import java.util.List;

/**
 * @author ZichaoXie
 * @date 2021/7/30 下午5:55
 * @Description: 1104. 二叉树寻路
 * @Times: 1
 */
public class pathInZigZagTree {
    public static List<Integer> pathInZigZagTree(int label) {
        List<Integer> list = new ArrayList<>();
        int o =label;
        int num = 0;
        int sum = 0;
        while (label>0){
            label/=2;
            if (label>0) {
                list.add(label);
                sum+=(int) Math.pow(2,num);
                num++;
            }
        }
//        System.out.println(num);
//        System.out.println(sum);
        //System.out.println(num);

        List<Integer> retlist = new ArrayList<>();
        for (int i=0;i<retlist.size();i++){
            if (i%2==0){
                retlist.add(sum*2-(int) Math.pow(2,num--)+1-list.get(i));
            }
        }
        return retlist;
    }

    public static void main(String[] args) {
        System.out.println(pathInZigZagTree(14));
    }
}
