public class isPalindrome {
//    public static boolean isPalindrome(int x){//字符串
//        String str=Integer.toString(x);
//        for (int i=0;i<str.length()/2;i++){
//            if (str.charAt(i)!=str.charAt(str.length()-1-i)){
//                return false;
//            }
//        }
//        return true;
//    }

//    public static boolean isPalindrome(int x){//数字比较
//        if (x<0)    return false;
//        int div=1;
//        while (x/div>=10)   div*=10;
//        while (x>0){
//            int left=x/div;
//            int right=x%10;
//            x=(x%div)/10;
//            if (left!=right)
//                return false;
//            div/=100;
//        }
//        return true;
//    }

    public static boolean isPalindrome(int x){
        if (x<0||(x%10==0&&x!=0))   return false;
        int tmp=0;
        while(x>tmp){
            tmp=tmp*10+x%10;
            x=x/10;
        }
        return x==tmp||x==tmp/10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }
}
