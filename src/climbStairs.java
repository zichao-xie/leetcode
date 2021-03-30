/**
 * 　　* @Description: 70.爬楼梯
 * 　　* @author ZichaoXie
 * 　　* @date 2021/3/30 22:34
 *
 */
public class climbStairs {
    public static int climbStairs(int n) {
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        int s1=1;
        int s2=2;
        int ret=0;
        for (int i=3;i<=n;i++){
            ret=s1+s2;
            s1=s2;
            s2=ret;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
