public class reverse {
    public static int reverse(int x) {
        //System.out.println(Math.pow(2,31)-1);
        //System.out.println(x);
        //if (x>Math.pow(2,31)-1||x<Math.pow(-2,31))  return 0;
        int res=0;
        while (x!=0){
            int tmp=x%10;
            if ((res>Integer.MAX_VALUE/10)||(res==Integer.MAX_VALUE/10&&tmp>Integer.MAX_VALUE%10)){
                return 0;
            }
            if ((res<Integer.MIN_VALUE/10)||(res==Integer.MIN_VALUE/10&&tmp<Integer.MIN_VALUE%10)){
                return 0;
            }
            res=res*10+tmp;
            x=x/10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(reverse(2112345677));
    }
}
