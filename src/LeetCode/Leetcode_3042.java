package LeetCode;


import java.util.ArrayList;
import java.util.List;

public class Leetcode_3042
{
        public static void main (String[] args)
        {
            String words[] = {"abab","ab"};
            System.out.println(countPrefixSuffixPairs(words));
        }

        public static int countPrefixSuffixPairs(String[] words)
    {

        List<String> sb = new ArrayList<>();

        for(String word : words)
        {
            sb.add(word);
        }

        int count = 0;
        for(int i = 0; i < words.length; i++)
        {
            for(int j = i + 1; j < words.length; j++)
            {
                if (words[j].startsWith(words[i])) {
                    count++;
                }
            }
        }
        return count;
    }

    }
