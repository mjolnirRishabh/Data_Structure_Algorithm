import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArrayAlternately {
    public static void main(String[] args) {
        long[] nums ={9000,30,7000,10,1,500,400};
        Arrays.sort(nums);
        ArrayList<Long> p = new ArrayList<>();
        long i=0,j=nums.length-1;
        while(i<j){
            if(nums[(int) i]<nums[(int) j]) {
                p.add(nums[(int) j]);
                p.add(nums[(int) i]);
                i++;
                j--;
            }
        }
        System.out.println(p);

    }
}
