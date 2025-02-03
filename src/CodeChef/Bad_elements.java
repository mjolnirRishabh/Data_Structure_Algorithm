package CodeChef;

import java.util.Arrays;

public class Bad_elements {
    public static void main(String[] args) {

        int[] arr = {1,3,2,1,2,2};
        int len = arr.length;
        System.out.println(counts(arr,len));
    }

    public static int counts(int[] arr, int len)
    {
        int count = 1;
        int max = 0;
        Arrays.sort(arr);

        for(int i = 0; i < len-1; i++)
        {
            if(arr[i] == arr[i+1])
            {
                count++;
            }
            else
            {
                count =1;
            }
            if(count > max)
            {
                max = count;
            }
        }
        return len-max;
    }
}
