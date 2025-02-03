package CodeChef;

import java.util.*;
import java.lang.*;

class Water_Bottles
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
//        int testcase = sc.nextInt();
//
//        while(testcase-- > 0)
//        {
            int amt_of_water = sc.nextInt();
            int cap_of_water = sc.nextInt();
            int total_bottle = sc.nextInt();

            System.out.println(Filled_Bottle(amt_of_water,cap_of_water,total_bottle));


//        }

    }

    public static int Filled_Bottle(int amt_of_water,int cap_of_water, int total_bottle)
    {

        if(amt_of_water < cap_of_water)
        {
            return 0;
        }

        int ans = 0;

        while(amt_of_water-- > 0 && total_bottle-- > 0)
        {
            ans = amt_of_water - cap_of_water;
        }

        return ans;
    }
}

