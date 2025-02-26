package LeetCode;

public class Leetcode_1729
{
    public static void main(String[] args)
    {
        int[] nums = {-3,-5,-3,-2,-6,3,10,-10,-8,-3,0,10,3,-5,8,7,-9,-9,5,-8};
        System.out.println(maxAbsoluteSum(nums));
    }

    public static int maxAbsoluteSum(int[] nums)
    {
        int prefix_sum = 0;
        int min_val = 0;
        int max_val = 0;

        for(int num : nums)
        {
            prefix_sum += num;
            if(prefix_sum > max_val) max_val = prefix_sum;
            if(prefix_sum < min_val) min_val = prefix_sum;
        }

        return Math.abs(max_val - min_val);
    }
}
