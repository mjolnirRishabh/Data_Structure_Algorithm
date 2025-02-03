package NPTEL;

import java.util.Scanner;

public class Pratice_03 {
    public static void main(String[] args) {

        int n = 10;
        int sum = 0;
        int i = 0;
        int result = 1;
        while (result<=n)
        {
            if(i%2==0)
            {
                if(i%3==0)
                {
                    sum += i;
                }
                result++;
            }
            i ++;
        }

        System.out.println(sum);
    }
}
