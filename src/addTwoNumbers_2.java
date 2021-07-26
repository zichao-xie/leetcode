public class addTwoNumbers_2 {
    /**
    　　* @Description: 2. 两数相加
    　　* @author ZichaoXie
    　　* @date 2021/6/24 16:17
       * @times: 2
    　　*/
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode();
        ListNode cur = pre;
        int carry = 0;
        while (l1!=null||l2!=null){
            int n1 = l1==null?0:l1.val;
            int n2 = l2==null?0:l2.val;

            int sum =n1+n2+carry;
            carry=sum/10;
            sum=sum%10;
            cur.next=new ListNode(sum);
            cur = cur.next;
            if (l1!=null){
                l1=l1.next;
            }
            if (l2!=null){
                l2=l2.next;
            }
        }
        if (carry!=0){
            cur.next=new ListNode(carry);
        }
        return  pre.next;
    }

    public static void main(String[] args) {

    }
}
