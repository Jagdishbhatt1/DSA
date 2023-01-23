package leetcode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public static void main(String args[]){
        String[] arr = {"jag", "gaj", "agj", "tan", "ant", "to"};
        List<List<String>> result = groupAnagrams(arr);
        for (List list: result){
            System.out.println(list);
        }
    }



        public static List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> res = new ArrayList<>();
            if (strs.length == 0) return res;
            HashMap<String, List<String>> map = new HashMap<>();
            for (String s : strs) {
                char[] hash = new char[26];
                for (char c : s.toCharArray()) {
                    hash[c - 'a']++;
                }
                String key = new String(hash);
                map.computeIfAbsent(key, k -> new ArrayList<>());
                map.get(key).add(s);
            }
            res.addAll(map.values());
            return res;
        }








    //Brout logic
    public static ArrayList<ArrayList<String>> isAnagram(String[] arr) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        int sumOfs=0;
        int sumOft=0;
        for (int i = 0; i < arr.length; i++) {
            ArrayList<String> list = new ArrayList<>();
            String s = arr[i];
            list.add(s);
            for (int j = i + 1; j < arr.length; j++) {
                String n = arr[j];
                if (n.length() == s.length()) {
                    for (int k = 0; k < s.length(); k++) {
                        sumOfs += s.charAt(k);
                        sumOft += n.charAt(k);
                    }
                    if (sumOft == sumOfs){
                        list.add(n);
                        i= j+1;
                    }
                }
                sumOfs = 0;
                sumOft = 0;
            }
            result.add(list);
        }
        return result;
    }

}
