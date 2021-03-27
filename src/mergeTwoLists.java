/**
 * 　　* @Description: 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 　　* @author ZichaoXie
 * 　　* @date 2021/3/19 22:48
 *
 */
public class mergeTwoLists {
    /**
    　　* @Description: 
    　　* @author ZichaoXie
    　　* @date 2021/3/19 22:48
    　　*/
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode pre=new ListNode();
        ListNode cur=pre;
        while (l1!=null&&l2!=null){
            if (l1.val<l2.val){
                cur.next=l1;
                cur=cur.next;
                l1=l1.next;
            }else {
                cur.next=l2;
                cur=cur.next;
                l2=l2.next;
            }
        }
        cur.next=l1==null?l2:l1;//遍历之后，l1和l2最多只有一个为null。
        return pre.next;
    }
}
