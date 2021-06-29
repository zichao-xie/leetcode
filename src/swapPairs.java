/**
 * 　　* @Description: 24. 两两交换链表中的节点
 * 　　* @author ZichaoXie
 * 　　* @date 2021/6/28 18:17
 *
 */
public class swapPairs {
    public ListNode swapPairs(ListNode head) {
        if (head==null)
            return head;

        ListNode cur=head;
        ListNode pre=cur.next;
        while(cur!=null&&cur.next!=null){
            ListNode tmp= cur.next.next;
            cur.next.next=cur;
            cur.next=tmp;
            cur =tmp;
        }
        return pre;
    }

}
