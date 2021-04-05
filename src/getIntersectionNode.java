/**
 * 　　* @Description:
 * 　　* @author ZichaoXie
 * 　　* @date 2021/4/5 22:59
 *
 */
public class getIntersectionNode {
    /**
    　　* @Description: 双指针。当一个节点遍历结束，从另一个节点头开始遍历，当两个节点值相同时有两种情况。
                    1. 位于相同部分起点
                    2. 同为null。
    　　* @author ZichaoXie
    　　* @date 2021/4/5 23:06
    　　*/
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null){
            return null;
        }
        ListNode l1=headA;
        ListNode l2=headB;
        while (l1!=l2){
            //注意是l1==null不是l1.next
            l1 = l1 == null ? headB : l1.next;
            l2 = l2 == null ? headA : l2.next;
        }
        return l1;
    }
}
