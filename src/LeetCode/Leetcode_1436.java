package LeetCode;

import java.util.*;

public class Leetcode_1436
{
    public static void main(String[] args)
    {

        String paths[][] = {{"London","New York"},{"New York","Lima"},{"Lima","Sao Paulo"}};

        List<List<String>> pathList = new ArrayList<>();
        for (String[] path : paths) {
            pathList.add(Arrays.asList(path));
        }

        System.out.println(destCity(pathList));

    }
    public static String destCity(List<List<String>> pathList)
    {
        Set<String> set = new HashSet<String>();

        for(List<String> path : pathList)
        {
            set.add(path.get(0));
        }

        for(List<String> path : pathList)
        {
            String dest = path.get(1);
            if(!set.contains(dest))
            {
                return dest;
            }
        }

        return "";
    }
}
