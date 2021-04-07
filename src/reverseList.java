

/**
 * 　　* @Description:
 * 　　* @author ZichaoXie
 * 　　* @date 2021/4/7 22:42
 *
 */
public class reverseList {
    /**
    　　* @Description: 迭代
    　　* @author ZichaoXie
    　　* @date 2021/4/7 23:06
    　　*/
//    public ListNode reverseList(ListNode head) {
//        ListNode pre = null;
//        ListNode cur = head;
//        while (cur != null){
//            ListNode next = cur.next;
//            cur.next=pre;
//            pre = cur;
//            cur = next;
//        }
//        return pre;
//    }
    /**
    　　* @Description: 递归
    　　* @author ZichaoXie
    　　* @date 2021/4/7 23:06
    　　*/
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
