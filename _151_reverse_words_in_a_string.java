/**
 * @author: SMY
 * @time: 2025/5/22  22:05
 * @description: 151. 反转字符串中的单词
 *   <a href="https://leetcode.cn/problems/reverse-words-in-a-string/description/">...</a>
 */

public class _151_reverse_words_in_a_string {

    public static String reverseWords(String s) {

        int start = 0;
        int end = s.length() - 1;

        while(s.charAt(start) == ' ') start++;
        while(s.charAt(end) == ' ') end--;

        StringBuilder sb = new StringBuilder();
        while(start <= end) {
            int temp = start;
            while(temp <= end && s.charAt(temp) != ' ') temp++;
            sb.append(reverseString(s.substring(start, temp)));
            if(temp <= end) sb.append(' ');
            while(temp <= end && s.charAt(temp) == ' ') temp++;
            start = temp;
        }

        return reverseString(sb.toString());
    }

    public static String reverseString(String s) {
        char[] array = s.toCharArray();

        int start = 0;
        int end = s.length() - 1;
        while(start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

        return new String(array);
    }

    public static void main(String[] args) {
        String s1 = reverseWords("the sky is blue");
        assert "blue is sky the".equals(s1): s1;

        String s2 = reverseWords("  hello world  ");
        assert "world hello".equals(s2): s2;

        String s3 = reverseWords("a good   example");
        assert "example good a".equals(s3): s3;
    }

}
