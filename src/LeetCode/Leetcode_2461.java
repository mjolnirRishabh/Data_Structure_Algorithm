package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;

public class Leetcode_2461 {
    public static void main(String[] args) {

        int [] nums = {1,5,4,2,9,9,9};
        int k = 3;
        Leetcode_2461 solution = new Leetcode_2461();
        long l = solution.maximumSubarraySum(nums, k);
        System.out.println(l);
    }
    public long maximumSubarraySum(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int n : set)
        {
            list.add(n);
        }

        long sum = 0;
        while(k-- > 0)
        {
            for (int i = list.size(); i > k; i++) {
                sum += Math.max(list.get(i), sum);
            }
        }
        return sum;
    }
}
