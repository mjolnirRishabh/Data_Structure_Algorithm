package LeetCode;

public class Leetcode_2496
{
    public static void main(String[] args)
    {
        String strs[] = {"alic3","bob","3","4","00000"};
        System.out.println(maximumValue(strs));
    }

    public static int maximumValue(String[] strs)
    {
        int maxValue = 0;

        for (String str : strs) {

            if (str.matches("\\d+")) {
                int numericValue = Integer.parseInt(str);
                maxValue = Math.max(maxValue, numericValue);
            } else {

                maxValue = Math.max(maxValue, str.length());
            }
        }
        return maxValue;
    }
}
