/**
 * @author ZichaoXie
 * @date 2021/7/21 下午6:00
 * @Description:
 */
public class getIntersectionNode_剑指52 {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        List<ListNode> list = new ArrayList<>();
//        ListNode tmp = headA;
//        while (tmp!=null){
//            list.add(tmp);
//            tmp= tmp.next;
//        }
//        tmp = headB;
//        while (tmp!=null){
//            if (list.contains(tmp)){
//                return tmp;
//            }
//            tmp=tmp.next;
//        }
//        return null;
//    }

    /**
     * @author  ZichaoXie
     * @date  2021/7/21 下午6:11
     * @description:设相交链表长度为c，链表一除相交链表外长度为a
     * 链表二为b。同时开始运动，当某个到达结尾时，从另一个链表的头开始运动。
     * 直到两节点相同。返回该节点，为空表示没有。
     * a+c+b = b+c+a
     */

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null||headB==null)
            return null;
        ListNode h1 = headA;
        ListNode h2 = headB;
        while (h1!=h2){
            //注意h1==null
            h1= h1==null?headB:h1.next;
            h2= h2==null?headA:h2.next;
        }
        return h1;
    }
}
