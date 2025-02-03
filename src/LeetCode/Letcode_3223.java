package LeetCode;

import java.util.HashMap;

public class Letcode_3223
{
    public static void main(String[] args)
    {
        String  s = "ucvbutgkohgbcobqeyqwppbxqoynxeuuzouyvmydfhrprdbuzwqebwuiejoxsxdhbmuaiscalnteocghnlisxxawxgcjloevrdcj";
        System.out.println(minimumLength(s));
    }

    public static int minimumLength(String s)
    {
//            if(s.length()<3)
//            {
//                return s.length();
//            }

        HashMap<Character,Integer> map = new HashMap<>();
            for(char ch : s.toCharArray())
            {
                map.put(ch,map.getOrDefault(ch,0)+1);
            }

            int ans = 0;
            int len = s.length();
            for(int value : map.values())
            {
                while(value >= 3)
                {
                    ans = len-2;
                    len = ans;
                    value -= 2;
//                    ans = Math.min(ans,Integer.MAX_VALUE);
                }
            }

            return len;
    }
}
