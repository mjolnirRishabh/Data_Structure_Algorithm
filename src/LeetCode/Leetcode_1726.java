package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_1726
{
    public static void main(String[] args)
    {
            int[] nums = {2,3,4,6};
        System.out.println(tupleSameProduct(nums));
    }

    public static int tupleSameProduct(int[] nums)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int product = 0;

        for(int i=0; i<nums.length; i++)
        {
            for(int j = i+1; j< nums.length; j++)
            {
                product = nums[i]*nums[j];
                map.put(product,map.getOrDefault(product,0)+1);
            }
        }

        int ans = 0;

        for(int m : map.values())
        {
            if(m >= 2)
            {
                ans += m * (m-1)/2;
            }
        }

        return ans*8;
    }

    }


