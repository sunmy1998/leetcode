import java.util.Stack;

/**
 * @author: SMY
 * @time: 2025/6/3  22:04
 * @description: 150. 逆波兰表达式求值
 *   <a href="https://leetcode.cn/problems/evaluate-reverse-polish-notation/description/">...</a>
 */

public class _150_evaluate_reverse_polish_notation {

    public static int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    stack.push(-stack.pop() + stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;  
                case "/":
                    Integer temp1 = stack.pop();
                    Integer temp2 = stack.pop();
                    stack.push(temp2 / temp1);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
        
    }

    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"2","1","+","3","*"}));
        System.out.println(evalRPN(new String[]{"4","13","5","/","+"}));
        System.out.println(evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }

}
