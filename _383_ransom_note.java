/**
 * https://leetcode.cn/problems/ransom-note/description/
 */
public class _383_ransom_note {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] hash = new int[26];

        for(char c : ransomNote.toCharArray()) {
            hash[c - 'a']++;
        }

        for(char c : magazine.toCharArray()) {
            hash[c - 'a']--;
        }

        for (int i : hash) {
            if (i > 0) return false;
        }

        return true;
    }

}
