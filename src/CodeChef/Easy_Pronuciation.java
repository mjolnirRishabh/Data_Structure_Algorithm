package CodeChef;

import java.util.Scanner;

public class Easy_Pronuciation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        sc.nextLine(); // Consume the newline after the integer input

        while (testcase-- > 0) {
            int len = sc.nextInt();
            sc.nextLine(); // Consume the newline after the integer input
            String str = sc.nextLine();
            System.out.println(easy(len, str));
        }

    }

    public static String easy(int len,String arr){


        int count = 0;

        for(int i=0;i<len;i++){
            if(arr.charAt(i) =='a' || arr.charAt(i) =='e' || arr.charAt(i)=='i' || arr.charAt(i)=='o' || arr.charAt(i)=='u'){
                count++;

                if(count==4){
                    return "No";
                }
            }else{

                if(i==4 && count == 0){
                    return "No";
                }

                count=0;
            }
        }

        return "Yes";
    }
}
