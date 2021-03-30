/**
 * 　　* @Description: 141.环形链表
 * 　　* @author ZichaoXie
 * 　　* @date 2021/3/30 23:13
 *
 */
public class hasCycle {
    public boolean hasCycle(ListNode head) {
        if (head==null){
            return false;
        }
        ListNode fast=head;
        ListNode low=head;
        while (fast!=null&&fast.next!=null){//注意判断条件，因为fast移动快，所以只要判断fast.next 和 fast.
            fast=fast.next.next;
            low=low.next;
            if (fast==low){
                return true;
            }
        }
        return false;
    }
}
