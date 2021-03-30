import java.util.Deque;
import java.util.LinkedList;

/**
 * 　　* @Description: 155.最小栈
 * 　　* @author ZichaoXie
 * 　　* @date 2021/3/30 23:29
 *
 */
class MinStack {
    Deque<Integer> deque;
    Deque<Integer> min_deque;

    /** initialize your data structure here. */
    public MinStack() {
        deque=new LinkedList<Integer>();
        min_deque=new LinkedList<Integer>();
        min_deque.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        deque.push(val);
        min_deque.push(Math.min(min_deque.peek(),val));
    }

    public void pop() {
        deque.pop();
        min_deque.pop();
    }

    public int top() {
        return deque.peek();
    }

    public int getMin() {
        return min_deque.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
