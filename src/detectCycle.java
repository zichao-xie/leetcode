/**
 * 　　* @Description: 142. 环形链表 II
 * 　　* @author ZichaoXie
 * 　　* @date 2021/4/1 23:34
 *
 */
public class detectCycle {
    /**
    　　* @Description: 双指针
     当快慢指针第一次相遇后，让快指针指向head，
     每次移动一步，再次相遇时即为入口，
    　　* @author ZichaoXie
    　　* @date 2021/4/1 23:54
    　　*/
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode low = head;
        while (fast != null && fast.next != null){
            fast=fast.next.next;
            low=low.next;
            if (fast==low){
                fast=head;
                while (fast!=low){
                    fast=fast.next;
                    low=low.next;
                }
                return fast;
            }
        }
        return null;
    }
}
