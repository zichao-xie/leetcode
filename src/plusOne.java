/**
 * 　　* @Description: 66. 加一
 * 　　* @author ZichaoXie
 * 　　* @date 2021/6/29 16:57
 *
 */
public class plusOne {
    /**
    　　* @Description: 如果是999的情况，结果为1000，只需要新建一个length+1的数组，让第一位为0即可。
                        将数字求出来会越界。
    　　* @author ZichaoXie
    　　* @date 2021/6/29 17:20
    　　*/
    public static int[] plusOne(int[] digits) {
        for (int i=digits.length-1;i>=0;i--){
            digits[i]++;
            if (digits[i]>9){
                digits[i]=0;
            }else {
                return digits;
            }
        }
        digits =  new int[digits.length+1];
        digits[0]=1;
        return digits;
    }

    public static void main(String[] args) {
        plusOne(new int[]{9,8,7,6,5,4,3,2,1,0});
    }
}
