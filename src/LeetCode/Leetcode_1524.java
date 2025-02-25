package LeetCode;

public class Leetcode_1524
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(numOfSubarrays(arr));
    }

    public static int numOfSubarrays(int[] arr)
    {
        int ans = 0 , odd_sum = 0, even_sum = 1, prefix_sum = 0;
        double mod = 1e9 + 7;

        for(int num : arr)
        {
            prefix_sum += num;

            if(prefix_sum % 2 == 0)
            {
                ans += odd_sum % mod;
                even_sum++;
            }
            if(prefix_sum % 2 != 0)
            {
                ans += even_sum % mod;
                odd_sum++;
            }
        }

        return ans;
    }
}
