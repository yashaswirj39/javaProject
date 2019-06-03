package leetcode.interviewQuestion;

import java.util.*;

public class GroupAnagrams {
    List<List<String>> goa = new ArrayList<>();

    private static List<List<String>> groupAnagrams(String[] arr) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s: arr){
            char[] c= s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if (!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            } else{
                map.get(key).add(s);
            }
        }
        return new ArrayList<List<String>>(map.values());
    }

    public static void main(String[] args) {
        String[] array = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(array));
    }
}