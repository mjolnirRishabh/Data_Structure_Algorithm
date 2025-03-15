package GFG;

public class Reverse_String
{
    public static void main(String[] args)
    {
        String s = " i like this program very much ";
        System.out.println(reverseWords(s));

    }

    public static String reverseWords(String s)
    {
        String[] ch = s.split("\\s+");
//        String ans = "";
        StringBuilder sb = new StringBuilder();

        for(int i=ch.length-1; i>=0; i--)
        {
            sb.append(ch[i]);

            if(i > 0) sb.append(" ");
        }

        return sb.toString();
    }
}
