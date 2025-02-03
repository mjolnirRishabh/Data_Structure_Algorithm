package NPTEL;

import java.util.Scanner;

public class Pratice_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String choice = "";
        int sum = 0;
        int product = 1;
        int count = 0;

        while(!choice.equals("q")) {
            choice = sc.next();

            if (!choice.equals("q")) {
                int number = Integer.parseInt(choice);
                sum = sum + number;
                product = product * number;
                count++;
            }
        }
        System.out.println("Sum" + sum + "Product" + product + "Average" + sum/count);
    }
}
