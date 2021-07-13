/**
 * @author ZichaoXie
 * @date 2021/7/12 下午5:39
 * @Description:
 */
public class H指数II_275 {

    public static int hIndex(int[] citations) {
        int res = 0;
        for (int i=citations.length-1;i>=0;i--){
            if (citations[i]>=citations.length-i){
                res++;
            }
            else {
                return res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.print(hIndex(new int[]{100,100,100,100,100}));
    }
}
