package CodeChef;

import java.util.Scanner;

public class Happy_String {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println(happyString(s));

    }

    public static String happyString(String s) {

//        String[] arr = {"a","e","i","o","u"};
        int count = 0;

        for(char a : s.toCharArray()) {
            if( a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                count++;
                if(count == 3) {
                    return "Happy";
                }
            }else{
                count = 0;
            }
        }
        return "Sad";

    }
}
