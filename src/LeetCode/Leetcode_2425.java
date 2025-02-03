    package LeetCode;

    public class Leetcode_2425
    {
        public static void main(String[] args)
        {
            int nums1[] = {1,2};
            int nums2[] = {3,4};
            System.out.println(xorAllNums(nums1,nums2));

        }
        public static int xorAllNums(int[] nums1, int[] nums2)
        {
            int[] arr = new int[nums1.length*nums2.length];

            int index = 0;


            for (int i = 0; i < nums1.length; i++)
            {
                for (int j = 0; j < nums2.length; j++)
                {
                    arr[index++] = nums1[i] ^ nums2[j];
                }
            }

            int ans = arr[0];

            for(int i=1; i<arr.length; i++)
            {
                ans ^= arr[i];
            }

            return ans;
        }
    }
