package LeetCode;

public class Leetcode_2470  {
    public static void main(String[] args) {

        int[] nums = {5,1,1,1,2};
        int k = 1;

        Leetcode_2470 lc =  new Leetcode_2470();
        System.out.println(lc.subarrayLCM(nums,k));
    }
        public int subarrayLCM(int[] nums, int k) {
            int n = nums.length;
            int ans = 0;

            for(int i = 0; i < n; i++) {
                int currLcm = nums[i];

                for(int j = i; j < n; j++) {
                    currLcm = lcm(currLcm, nums[j]);
                    if (currLcm == k) ans++;
                }
            }

            return ans;
        }

        public int lcm(int a, int b) {
            return a * b / gcd(a, b);
        }

        public int gcd(int a, int b) {
            return (b == 0) ? a : gcd(b, a % b);
        }
    }
