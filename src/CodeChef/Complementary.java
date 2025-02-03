package CodeChef;

public class Complementary 
{
    public static void main(String[] args) 
    {
        String s = "ATCG";
        System.out.println( complementary(s));
    }
    
    public static String complementary(String s)
    {

        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray())
        {
            if(ch == 'A')
            {
                sb.append('T');
            }
            if(ch == 'T')
            {
                sb.append('A');
            }
            if(ch == 'C')
            {
                sb.append('G');
            }
            if(ch == 'G')
            {
                sb.append('C');
            }
        }

        return sb.toString();
    }
}
