/**
 * @author: SMY
 * @time: 2025/5/24  10:50
 * @description: 459. 重复的子字符串
 *   <a href="https://leetcode.cn/problems/repeated-substring-pattern/description/">...</a>
 */

public class _459_repeated_substring_pattern {

    public static boolean repeatedSubstringPattern(String s) {
        String ss = s+s;
        return ss.substring(1, ss.length()-1).contains(s);
    }

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abab"));
        System.out.println(repeatedSubstringPattern("aba"));
        System.out.println(repeatedSubstringPattern("abcabcabcabc"));
    }

}
