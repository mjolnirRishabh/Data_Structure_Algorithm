import java.util.Scanner;

public class chalk {
    public static void main(String[] args)
    {
      /*  Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];

        for(int i=0;i<len;i++)
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();*/
        int[] arr = {3,4,1,2};
        int k = 25;
        System.out.println(chalkReplacer(arr,k));

    }
    public static int chalkReplacer(int[] chalk, int k)
    {
        int total = 0;

        for(int ch : chalk)
        {
            total += ch;
        }

        k %= total;

        for (int i = 0; i < chalk.length; i++)
        {
            if(chalk[i] > k) return i;
            k -= chalk[i];
        }
        return -1;
    }

}
