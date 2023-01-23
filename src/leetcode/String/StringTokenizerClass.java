package leetcode.String;

import java.util.StringTokenizer;

public class StringTokenizerClass {
    public static void main(String args[]){
        String s = "my name is jagdish";
        StringTokenizer st = new StringTokenizer(s);
        System.out.println(st.countTokens());
        while (st.hasMoreElements()){
            System.out.println(st.nextToken());
        }

    }
}
