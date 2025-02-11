package LeetCode;

public class Leetcode_1910
{
    public static void main(String[] args)
    {
        String s = "daabcbaabcbc", part = "abc" ;
        System.out.println(removeOccurrences(s,part));
    }

    public static String removeOccurrences(String s, String part)
    {
        StringBuilder sb = new StringBuilder(s);

        while (sb.indexOf(part) != -1) {
            int index = sb.indexOf(part);
            sb.delete(index, index + part.length());
        }

        return sb.toString();


    }
}
