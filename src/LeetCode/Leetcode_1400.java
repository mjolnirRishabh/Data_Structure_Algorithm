package LeetCode;

import java.util.HashMap;

public class Leetcode_1400
{
    public static void main(String[] args)
    {
        String s = "annabelle";
        int k = 2;
        System.out.println(canConstruct(s,k));
    }
    public static boolean canConstruct(String s, int k) {

        if(s.length() < k) return false;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : s.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int oddcount = 0;

        for(int value : map.values())
        {
            if(value%2 != 0)
            {
                oddcount++;
            }
        }

        return oddcount < k;
    }
}
