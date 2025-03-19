package GFG;

import java.util.ArrayList;
import java.util.HashMap;

public class gfg_09
{
    public static void main(String[] args)
    {
        String s1 = "aab", s2 = "xzy";
        System.out.println(areIsomorphic(s1, s2));
    }
    public static boolean areIsomorphic(String s1, String s2)
    {
        // Your code here
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map1 = new HashMap<>();


        for (char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s2.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }


        return new ArrayList<>(map.values()).equals(new ArrayList<>(map1.values()));



    }
}
