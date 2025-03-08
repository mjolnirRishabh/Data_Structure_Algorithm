package GFG;

public class gfg_01
{
    public static void main(String[] args)
    {
            String s = "GeeKs";
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s)
    {
        // code here
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}
