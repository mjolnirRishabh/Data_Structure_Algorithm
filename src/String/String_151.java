package String;

import java.util.Scanner;

public class String_151 {
    public String reverseWords(String s) {

            String[] str = s.trim().split("\\s+");
            String out = "";

        for (int i = str.length - 1; i >= 0 ; i--) {

            out += str[i] + " ";
        }

        return out ;
    }

    public static void main(String[] args) {

        String_151 str = new String_151();
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter String : ");
        String t = sc.nextLine();


        System.out.println(str.reverseWords(t));


    }
}
