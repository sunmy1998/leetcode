/**
 * @author: SMY
 * @time: 2025/5/29  21:55
 * @description: 242. 有效的字母异位词
 *   <a href="https://leetcode.cn/problems/valid-anagram/description/">...</a>
 */

public class _242_valid_anagram_description {

    public static boolean isAnagram(String s, String t) {
        int[] hash = new int[26];

        for (char c : s.toCharArray()) {
            hash[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            hash[c - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (hash[i] != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));

        System.out.println(isAnagram("rat", "car"));
    }

}
