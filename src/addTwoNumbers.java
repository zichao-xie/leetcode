public class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int tmp = 0;//进位
        ListNode pre = new ListNode();//通常链表的题目都会先创建一个pre节点，return pre.next;
        ListNode cur = pre;
        while (l1!=null||l2!=null){//当两个链表至少一个不为空时
            int x=l1==null?0: l1.val;
            int y=l2==null?0: l2.val;

            int sum=x+y+tmp;
            tmp=sum/10;
            sum=sum%10;

            cur.next=new ListNode(sum);
            cur=cur.next;

            if (l1!=null){
                l1=l1.next;
            }
            if (l2!=null){
                l2=l2.next;
            }
        }
        if (tmp>0){//可以在上面while里面加一个 ||tmp!=0,这里就不用if判断最后一位是否有进位了
            cur.next=new ListNode(tmp);
        }
        return pre.next;
//        int tmp=0;
//        ListNode pre = new ListNode();
//        ListNode cur = pre;
//        while(l1!=null||l2!=null){
//            int x=l1==null?0:l1.val;
//            int y=l2==null?0:l2.val;
//
//            int sum=x+y+tmp;
//            tmp=sum/10;
//            sum=sum%10;
//
//            cur.next=new ListNode(sum);
//            cur=cur.next;
//
//            if (l1!=null)
//                l1=l1.next;
//            if (l2!=null)
//                l2=l2.next;
//        }
//        if (tmp>0)
//            cur.next=new ListNode(tmp);
//        return pre.next;

    }

    public static void main(String[] args) {

    }
}
