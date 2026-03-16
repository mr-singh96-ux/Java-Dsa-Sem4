//Group Anagrams

import java.util.*;

public class q4{
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();

        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String k = new String(ch);
            map.putIfAbsent(k, new ArrayList<>());
            map.get(k).add(s);
        }
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}