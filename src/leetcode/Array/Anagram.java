package leetcode.Array;

public class Anagram {
    public static void main(String args[]){
        //System.out.println(anagram("anagram", "nagramf"));
        System.out.println(isAnagram("anagram", "nagramf"));
    }

    private static boolean anagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        int sumOfs=0;
        int sumOft=0;
        for (int i = 0; i<s.length(); i++){
            sumOfs += s.charAt(i);
            sumOft += t.charAt(i);
        }
        if (sumOft ==sumOfs) {
            return true;
        } else {
            return false;
        }

    }


    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int n : store) if (n != 0) return false;

        return true;
    }

}
