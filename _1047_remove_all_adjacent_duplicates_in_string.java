import java.util.Stack;

/**
 * @author: SMY
 * @time: 2025/6/2  13:22
 * @description: 1047. 删除字符串中的所有相邻重复项
 *   <a href="https://leetcode.cn/problems/remove-all-adjacent-duplicates-in-string/description/">...</a>
 */

public class _1047_remove_all_adjacent_duplicates_in_string {

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty() || stack.peek() != c){
                stack.push(c);
            }else{
                stack.pop();
            }
        }

        String res = "";

        while(!stack.isEmpty()){
            res = stack.pop() + res;
        }

        return res;

    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }

}
