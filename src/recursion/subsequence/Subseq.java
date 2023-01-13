package recursion.subsequence;

import java.util.ArrayList;

public class Subseq {
    public static void main(String args[]){
       subSequence("", "jag");
       System.out.println(subSeqReturn("", "abc"));
       subSeqAscValue("", "abc");
    }
    public static void subSequence(String pro, String up){
        if (up.isEmpty()){
            System.out.println(pro);
            return;
        }
        subSequence(pro+up.charAt(0), up.substring(1));
        subSequence(pro, up.substring(1));
    }


    public static ArrayList<String> subSeqReturn(String pro, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(pro);
            return list;
        }
        ArrayList<String> left = subSeqReturn(pro+up.charAt(0), up.substring(1));
        ArrayList<String>  right = subSeqReturn(pro, up.substring(1));
        left.addAll(right);
        return left;
    }

    //Asc value
    public static void subSeqAscValue(String pro, String up){
        if (up.isEmpty()){
            System.out.println(pro);
            return;
        }
        char ch = up.charAt(0);
        subSeqAscValue(pro+(up.charAt(0)+0), up.substring(1));
        subSeqAscValue(pro, up.substring(1));

    }

}
