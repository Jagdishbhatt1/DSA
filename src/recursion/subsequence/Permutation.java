package recursion.subsequence;

import java.util.ArrayList;

public class Permutation {
    public static void main(String args[]){
        permutations("", "abc");
        System.out.println(permutationsReturn("", "abc"));
        System.out.println(countPermutations("", "abc"));
        countPermutationsArgument("", "abc", 0);
    }

    public static void permutations(String pro, String up) {
        if (up.isEmpty()) {
            System.out.print(pro + " ");
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= pro.length(); i++) {
            String f = pro.substring(0,i);
            String s = pro.substring(i,pro.length());
            permutations(f+ch+s, up.substring(1));
            int a = 0;
        }
    }
    public static ArrayList<String> permutationsReturn(String pro, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(pro);
            return list;
        }
        ArrayList<String> result = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i =0; i<=pro.length(); i++){

            String f = pro.substring(0,i);
            String s = pro.substring(i,pro.length());
            result.addAll(permutationsReturn(f+ch+s, up.substring(1)));

        }
        return result;
    }

    public static int countPermutations(String pro, String up){

        if (up.isEmpty()){
            return 1;
        }
        int count=0;
        char ch = up.charAt(0);
        for (int i =0; i<=pro.length(); i++){

            String f = pro.substring(0,i);
            String s = pro.substring(i,pro.length());
            count = count + countPermutations(f+ch+s, up.substring(1));

        }
        return count;
    }


    // ?????? not working apply logic
    public static int countPermutationsArgument(String pro, String up, int count){

        if (up.isEmpty()){
            return 1;
        }
        char ch = up.charAt(0);
        for (int i =0; i<=pro.length(); i++) {

            String f = pro.substring(0, i);
            String s = pro.substring(i, pro.length());
            count=count+countPermutationsArgument(f + ch + s, up.substring(1), count);
        }
        return count;
    }

}
