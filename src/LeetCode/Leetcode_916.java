package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Leetcode_916
{
    public static void main(String[] args)
    {
        String words1[] = {"amazon","apple","facebook","google","leetcode"};
        String words2[] = {"e","o"};

        System.out.println(wordSubsets(words1,words2));
    }
    public static List<String> wordSubsets(String[] words1, String[] words2)
    {
        int[] req = new int[26];
        for (String word : words2) {
            int[] cur = new int[26];
            for (char c : word.toCharArray()) {
                cur[c - 'a']++;
                req[c - 'a'] = Math.max(req[c - 'a'], cur[c - 'a']);
            }
        }

        List<String> ans = new ArrayList<>();
        for (String word : words1) {
            int[] cur = new int[26];
            for (char c : word.toCharArray()) cur[c - 'a']++;

            boolean isValid = true;
            for (int i = 0; i < 26; i++) {
                if (cur[i] < req[i]) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) ans.add(word);
        }

        return ans;
    }
}
