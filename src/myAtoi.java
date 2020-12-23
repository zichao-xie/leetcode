import javax.print.DocFlavor;

public class myAtoi {
    public static int myAtoi(String s) {
        StringBuilder stringBuilder=new StringBuilder();
        boolean flag=false;//是否出现了数字或符号
        boolean nega=false;//是否为负数
        for (char c:s.toCharArray()){
            if (c=='-'&&!flag){
                nega=true;
                flag=true;
            }else if (c=='+'&&!flag){
                flag=true;
            }else if (c>='0'&&c<='9'){
                flag=true;
                stringBuilder.append(c);
            }else if (c==' '){
                //donothing
                if (flag)
                    break;
            }else{
                break;
            }
        }
        //System.out.println(stringBuilder);

        int res=0;
        for (char c:stringBuilder.toString().toCharArray()){
            int tmp=c-'0';
            if ((!nega)&&((res>Integer.MAX_VALUE/10)||(res== Integer.MAX_VALUE/10&&tmp>Integer.MAX_VALUE%10)))
                return Integer.MAX_VALUE;
            if (nega&&((res>0-Integer.MIN_VALUE/10)||(res== 0-Integer.MIN_VALUE/10&&tmp>0-Integer.MIN_VALUE%10)))
                return Integer.MIN_VALUE;
            res=res*10+tmp;

        }
        return res=nega==false?res:-res;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("    +4 2"));
    }
}
