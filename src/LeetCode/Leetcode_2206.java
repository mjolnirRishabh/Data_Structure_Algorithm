package LeetCode;

import java.util.HashMap;

public class Leetcode_2206
{
    public static void main(String[] args)
    {
        int nums[] = {1,2,3,4};
        System.out.println(divideArray(nums));

    }
    public static boolean divideArray(int[] nums)
    {
            HashMap<Integer, Integer> map = new HashMap<>();
           // boolean flag = false;

            for(int i = 0; i < nums.length; i++)
            {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }

            for(int key : map.values())
            {
                if(key%2 == 1)
                {
                    return false;
                }
            }

            return true;
    }
}
