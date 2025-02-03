package LeetCode;

public class Leetcode_2657
{
    public static void main(String[] args)
    {
        int[] A = {1,3,2,4};
        int[] B = {3,1,2,4};
        System.out.println(findThePrefixCommonArray(A,B));
    }

    public static int[] findThePrefixCommonArray(int[] A, int[] B)
    {
        int m = A.length;
        int[] ans = new int[m];
        int[] count = new int[m+1];
        int var = 0;

        for(int i = 0; i < m; i++)
        {
            count[A[i]]++;
            if(count[A[i]] == 2) var++;
            count[B[i]]++;
            if(count[B[i]] == 2) var++;
            ans[i] = var;
        }
        return ans;
    }
}
