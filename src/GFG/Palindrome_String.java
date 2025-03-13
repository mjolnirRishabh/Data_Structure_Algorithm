package GFG;

public class Palindrome_String
{
    public static void main(String[] args)
    {
        String st = "abc";
        System.out.println(isPalindrome(st));
    }

    public static boolean isPalindrome(String s)
    {
        int left = 0;
        int right = s.length() -1;

        while(right > left)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
