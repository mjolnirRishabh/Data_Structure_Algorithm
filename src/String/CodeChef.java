package String;

import java.util.Scanner;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {

    Codechef obj = new Codechef();
        System.out.println(obj.Wordle("ABCDE","EDCBA"));


    }

    public String Wordle (String S , String T){

        StringBuilder sb = new StringBuilder();
//        int index = 0;

        for (int i = 0; i < S.length(); i++) {

        if(S.charAt(i) == T.charAt(i))
        {

            sb.append("G");
        }
        else{
            sb.append("B");
        }
        }

        return sb.toString();

    }
}

