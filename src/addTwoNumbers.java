public class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int tmp=0;
        ListNode pre = new ListNode();
        ListNode cur = pre;
        while(l1!=null||l2!=null){
            int x=l1==null?0:l1.val;
            int y=l2==null?0:l2.val;

            int sum=x+y+tmp;
            tmp=sum/10;
            sum=sum%10;

            cur.next=new ListNode(sum);
            cur=cur.next;

            if (l1!=null)
                l1=l1.next;
            if (l2!=null)
                l2=l2.next;
        }
        if (tmp>0)
            cur.next=new ListNode(tmp);
        return pre.next;

    }

    public static void main(String[] args) {

    }
}
