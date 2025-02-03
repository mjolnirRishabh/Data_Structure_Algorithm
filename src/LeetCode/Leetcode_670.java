package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Leetcode_670 {
    public static void main(String[] args) {

       int num = 2736;
       Leetcode_670 leet = new Leetcode_670();
        System.out.println(leet.maximumSwap(num));
    }

    public int maximumSwap(int num) {
        int maxNum = num;
        String t = Integer.toString(num);

        for (int i = 0; i < t.length(); i++) {
            for (int j = i + 1; j < t.length(); j++) {
                // Swap characters at indices i and j
                char[] chars = t.toCharArray();
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;

                // Convert back to integer and compare
                int swappedNum = Integer.parseInt(new String(chars));
                maxNum = Math.max(maxNum, swappedNum);
            }
        }
        return maxNum;
    }
}

