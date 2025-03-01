package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Leetcode_2460
{
    public static void main(String[] args)
    {

        int[] nums = {1,2,2,1,1,0};
        System.out.println(Arrays.toString(applyOperations(nums)));

    }

    public static int[] applyOperations(int[] nums)
    {

        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[i] == nums[i+1])
            {
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }

        int[] result = new int[nums.length];
        int index = 0;

        for (int num : nums) {
            if (num != 0) {
                result[index++] = num;
            }
        }

        return result;

    }
}
