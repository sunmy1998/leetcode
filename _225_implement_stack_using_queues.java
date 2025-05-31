import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: SMY
 * @time: 2025/5/31  11:17
 * @description: 225. 用队列实现栈
 *   <a href="https://leetcode.cn/problems/implement-stack-using-queues/description/">...</a>
 */

public class _225_implement_stack_using_queues {

    class MyStack {

        Queue<Integer> queue1;
        Queue<Integer> queue2;

        public MyStack() {
            queue1 = new LinkedList<Integer>();
            queue2 = new LinkedList<>();
        }

        public void push(int x) {
            queue2.offer(x);
            while(!queue1.isEmpty()){
                queue2.offer(queue1.poll());
            }
            Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;
        }

        public int pop() {
            return queue1.poll();
        }

        public int top() {
            return queue1.peek();
        }

        public boolean empty() {
            return queue1.isEmpty();
        }
    }

}
