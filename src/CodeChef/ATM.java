package CodeChef;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int testcase = sc.nextInt();
//        sc.nextLine();
//        int k = sc.nextInt();
//        sc.nextLine();
//        int money = sc.nextInt();
//        int[] arr = new int[k];

        int k = 5;
        int money = 10;
        int[] arr = {3,5,3,2,1};

//        for (int i = 0; i < k; i++) {
//                arr[i] = sc.nextInt();
//        }
        System.out.println(atm(money, arr));

    }

    public static String atm(int money , int arr[]){

//        int leftmoney = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < arr.length ; i++){

            if(money >= arr[i]){
                sb.append("1");

                money -= arr[i];
            }
            else{
                sb.append("0");
            }
        }
        return sb.toString();
    }
}
