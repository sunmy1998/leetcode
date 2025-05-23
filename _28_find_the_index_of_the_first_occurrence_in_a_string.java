/**
 * @author: SMY
 * @time: 2025/5/23  21:48
 * @description: 28. 找出字符串中第一个匹配项的下标
 * <a href="https://leetcode.cn/problems/find-the-index-of-the-first-occurrence-in-a-string/description/">...</a>
 */

public class _28_find_the_index_of_the_first_occurrence_in_a_string {

    public static int strStr(String ss, String pp) {
        int n = ss.length(), m = pp.length();
        char[] s = ss.toCharArray(), p = pp.toCharArray();

        for(int i = 0; i <= n - m; i++) {
            int a = i, b = 0;
            while(b < m && s[a] == p[b]) {
                a++;
                b++;
            }
            if(b == m) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int i1 = strStr("mississippi", "issip");
        System.out.println(i1);

        int i2 = strStr("leetcode", "leeto");
        System.out.println(i2);
    }

}
