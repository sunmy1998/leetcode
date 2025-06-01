import java.util.Stack;

/**
 * @author: SMY
 * @time: 2025/6/1  17:38
 * @description: 20. 有效的括号
 *   <a href="https://leetcode.cn/problems/valid-parentheses/description/">...</a>
 */

public class _20_valid_parentheses {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == '('){
                stack.push(')');
            }else if(c == '['){
                stack.push(']');
            }else if(c == '{'){
                stack.push('}');
            }else if(stack.isEmpty() || stack.peek() != c){
                return false;
            }else{
                stack.pop();
            }

        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([])"));
    }

}
