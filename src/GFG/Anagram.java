package GFG;

import java.util.Arrays;
import java.util.HashSet;

public class Anagram
{
    public static void main(String[] args)
    {
        String s1 = "geeks";
        String s2 = "kseeg";

        System.out.println(areAnagrams(s1,s2));
    }

    public static boolean areAnagrams(String s1, String s2)
    {

        char str1[]=s1.toCharArray();
        char str2[]=s2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        String ss1=new String(str1);
        String ss2=new String(str2);
        if(ss1.equals(ss2)){
            return true;
        }
        else{
            return false;
        }
    }


}
