import java.util.Stack;

/**
 * @author: SMY
 * @time: 2025/5/30  23:29
 * @description: 232. 用栈实现队列
 *   <a href="https://leetcode.cn/problems/implement-queue-using-stacks/description/">...</a>
 */

public class _232_implement_queue_using_stacks {

    class MyQueue {

        Stack<Integer> stackIn;
        Stack<Integer> stackOut;

        public MyQueue() {
            stackIn = new Stack<>();
            stackOut = new Stack<>();
        }

        public void push(int x) {
            stackIn.push(x);
        }

        public int pop() {
            dumpStackIn();
            return stackOut.pop();
        }

        public int peek() {
            dumpStackIn();
            return stackOut.peek();
        }

        public boolean empty() {
            return stackIn.isEmpty() && stackOut.isEmpty();
        }

        /**
         * 将stackIn元素导入到stackOut中
         */
        private void dumpStackIn() {
            if (!stackOut.isEmpty()) return;
            while (!stackIn.isEmpty()) {
                stackOut.push(stackIn.pop());
            }
        }
    }

}
