package String;

import java.util.HashSet;

public class String_1071 {
    public String gcdOfStrings(String str1, String str2){


        if(str2.length() > str1.length()){
            return gcdOfStrings(str2,str1);
        }
       if(str1.equals(str2)){
           return str1;
       }

       if(str1.startsWith(str2)) {
           return gcdOfStrings(str1.substring(str2.length()),str2);
       }
      return "";


    }

    public static void main(String[] args) {

        String_1071 st = new String_1071();
        System.out.println(st.gcdOfStrings("ABCABC","ABC"));
    }
}
