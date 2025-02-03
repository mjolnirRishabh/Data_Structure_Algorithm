package String;

import java.util.Scanner;

public class String_43 {

    public String multiply(String num1, String num2) {

        int nums1 = Integer.parseInt(num1);
        int nums2 = Integer.parseInt(num2);
        int ans = nums1*nums2;

        return String.valueOf(ans);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String first : ");
        String num1 = sc.nextLine();
        System.out.print("Enter String second : ");
        String num2 = sc.nextLine();

        String_43 str = new String_43();
        System.out.println(str.multiply(num1,num2));
    }
}
