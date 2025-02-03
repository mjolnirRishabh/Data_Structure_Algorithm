package CodeChef;

import java.util.Scanner;

public class Lucky_Seven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(lucky(st));

    }

    public static String lucky(String st){

        String ans = "";

        for (int i = 1; i <= st.length()-1; i++){
            if (i == 6){
                ans = String.valueOf(st.charAt(i));
            }
        }
        return ans;
    }
}
