package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Leetocode_1790 {
    public static void main(String[] args) {
        String s1 = "attack";
        String s2 = "defend";

        System.out.println(areAlmostEqual(s1, s2));
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        List<Integer> diffIndices = new ArrayList<>();

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffIndices.add(i);
            }
        }

        if (diffIndices.size() == 0) {
            return true; // Strings are already equal
        }

        if (diffIndices.size() != 2) {
            return false; // More than one swap required
        }

        int i = diffIndices.get(0), j = diffIndices.get(1);
        return s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i);
    }
}



// Approach 2 :




    /*public boolean areAlmostEqual(String s1, String s2)
    {

        int count = 0;
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i])
                return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                count++;
        }
        return count <= 2;
    }*/

