/**
 * @author: SMY
 * @time: 2025/5/21  21:56
 * @description: 541. 反转字符串II
 *   <a href="https://leetcode.cn/problems/reverse-string-ii/description/">...</a>
 */

public class _541_reverse_string_ii {

    public static String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();

        int start = 0;
        int length = s.length();

        while(start < length) {

            int firstK = Math.min(start + k, length);
            int secondK = Math.min(start + 2 * k, length);

            sb.append(reverse(s.substring(start, firstK)));
            sb.append(s, firstK, secondK);

            start = secondK;
        }


        return sb.toString();
    }

    public static String reverse(String s){
        char[] arr = s.toCharArray();
        int left = 0, right = s.length() - 1;
        while(left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String s1 = reverseStr("abcdefg", 2);
        assert s1.equals("bacdfeg") : "s1应为'bacdfeg'，但实际是'" + s1 + "'";

        String s2 = reverseStr("abcd", 2);
        assert s2.equals("bacd") : "s2应为'bacd'，但实际是'" + s2 + "'";

        System.out.println("所有测试通过！");
    }

}
