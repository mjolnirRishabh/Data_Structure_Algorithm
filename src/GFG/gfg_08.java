package GFG;

public class gfg_08
{
    public static void main(String[] args)
    {
      String s1 = "geeksforgeeks", s2 = "geeksgeeksfor";
        System.out.println(isRotated(s1, s2));
    }
    public static boolean isRotated(String s1, String s2)
    {
        // Your code here
        String str1 = s1.concat(s1);
        String str2 = s2.concat(s2);

        int a = str1.indexOf(s2);
        int b = str2.indexOf(s1);

        if(a==2 || b==2){
            return true;
        }
        return false;
    }
}

