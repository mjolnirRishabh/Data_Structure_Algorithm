package LeetCode;

public class Leetcode_2342
{
    public static void main(String[] args)
    {
        int[] nums = {10,12,19,14};
        System.out.println(maximumSum(nums));
    }
    public static int maximumSum(int[] nums)
    {
        int ans = -1;

        for(int i=0; i<nums.length;i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(i!=j)
                {
                    if(sumofdigit1(nums[i]) == sumofdigit1(nums[j]))
                    {
                        ans = Math.max(ans,nums[i]+nums[j]);
                    }
                }
            }
        }
        return ans;
    }

    private static int sumofdigit1(int j)
    {
        int sum = 0;
        while (j > 0) {
            sum += j % 10;
            j /= 10;
        }
        return sum;
    }

    private static int sumofdigit(int i)
    {
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }
}
