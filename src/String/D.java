package String;

import java.util.Scanner;

class D {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
//        Scanner sc = new Scanner(System.in);
//        int testcase = sc.nextInt();

//        while(testcase-- > 0)
//        {
        int a = 4;
        int b = 14;

        System.out.println(Factor(a, b));
//        }

    }

    public static String Factor(int a, int b) {
        if (b % a == 0) return "Yes";

        if (b % a != 0) {
            if (b > 2 * a) {
                return "No";
            } else {
                return "Yes";
            }
        }
        return "No";
    }
}
