package LeetCode;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Leetcode_1800
{
    public static void main(String[] args)
    {
        int[] nums = {10,20,30,5,10,50};
        System.out.println(maxAscendingSum(nums));
    }

    public static int maxAscendingSum(int[] nums)
    {
        int res=0;
        int sum=nums[0];

        for(int i=1; i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                sum+=nums[i];
            }else{
                res=Math.max(res,sum);
                sum = nums[i];
            }
        }

        res = Math.max(res,sum);
        return res;

    }
}
