package GFG;

public class gfg_07
{
    public static void main(String[] args)
    {
      String a = "abcd";
      String b = "cdab";

      System.out.println(areRotations(a, b));
    }
    public static boolean areRotations(String s1, String s2)
    {
        // Your code here
        String ans = s1 + s1;
        return ans.contains(s2);
    }
}

