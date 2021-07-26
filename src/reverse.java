public class reverse {
    //time 2

    public static int reverse(int x) {
        int ret = 0;
        while (x!=0){
            int  tmp = x%10;
            if (ret>Integer.MAX_VALUE/10||(ret==Integer.MAX_VALUE/10&&tmp>Integer.MAX_VALUE%10)){
                return 0;
            }
            if (ret<Integer.MIN_VALUE/10||(ret==Integer.MIN_VALUE/10&&tmp<Integer.MIN_VALUE%10)){
                return 0;
            }
            ret=ret*10+tmp;
            x/=10;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(reverse(2112345677));
    }
}
