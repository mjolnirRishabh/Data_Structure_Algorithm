package CodeChef;

import java.math.BigInteger;
import java.util.Scanner;

public class Add_One {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter test input");
        int n = sc.nextInt();

        while(n-->0){

            String s = sc.next();
            BigInteger big = new BigInteger(s);
            BigInteger ans = big.add(BigInteger.ONE);
            System.out.println(ans);
        }
    }

}
