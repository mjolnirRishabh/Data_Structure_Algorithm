package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Uncommon_Words {
    public static void main(String[] args) {

        String s1 = "this apple is sweet" ;
        String s2 = "this apple is sour";

        Uncommon_Words uncommon_words = new Uncommon_Words();
        String[] strings = uncommon_words.uncommonFromSentences(s1, s2);
        System.out.println(Arrays.toString(strings));

    }
    public String[] uncommonFromSentences(String s1, String s2) {

        List<String> ls = new ArrayList<>();

        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();

        String[] t1 = s1.split(" ");
        String[] t2 = s2.split(" ");

        for(String s : t1){
            map1.put(s,map1.getOrDefault(s,0)+1);
        }

        for(String tt : t1){
            map2.put(tt,map2.getOrDefault(tt,0)+1);
        }

        for(String key : map1.keySet()){
            if(map1.get(key)==1 && !map2.containsKey(key)){
                ls.add(key);
            }
        }

        for(String key : map2.keySet()){
            if(map2.get(key)==1 && !map1.containsKey(key)){
                ls.add(key);
            }
        }


        String[] ans = new String[ls.size()];

        for(int i=0; i<ans.length; i++){
            ans[i] = ls.get(i);
        }

        return ans;
    }
}
