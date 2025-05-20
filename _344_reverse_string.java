/**
 * @author: SMY
 * @time: 2025/5/20  21:46
 * @description: 344. 反转字符串
 *   <a href="https://leetcode.cn/problems/reverse-string/description/">题目链接</a>
 */

public class _344_reverse_string {

    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;

        while(left < right) {
            char temp = s[left];

            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        char[] s = "hello".toCharArray();
        reverseString(s);

        assert "olleh".equals(new String(s));

    }

}
