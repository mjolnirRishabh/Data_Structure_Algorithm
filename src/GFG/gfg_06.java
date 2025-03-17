package GFG;

import java.util.HashMap;
import java.util.HashSet;

public class gfg_06
{
    public static void main(String[] args)
    {
        String  s = "geeksforgeeks";
        System.out.println(nonRepeatingChar(s));
    }

    public static char nonRepeatingChar(String s)
    {
        // Your code here
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : s.toCharArray())
        {
            if(map.get(c) == 1)
            {
                return c;
            }
        }

        return (char) -1;

    }


}
