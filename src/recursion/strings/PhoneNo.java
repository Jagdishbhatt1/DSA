package recursion.strings;

import java.util.ArrayList;

public class PhoneNo {

    public static void main(String args[]){
        pad("", "89");
        System.out.println(padReturn("", "12"));
        System.out.println(countReturn("", "12"));
    }
    private static ArrayList<String> padReturn(String p, String u) {
        //base condition
        if (u.isEmpty()){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> result = new ArrayList<>();
        int n = u.charAt(0)-'0';
        for (int i= (n-1)*3; i<(n*3);i++){
            if(i!=26) {
                char ch = (char) ('a' + i);
                result.addAll(padReturn(p + ch, u.substring(1)));
            }
        }
        return result;
    }

    private static void pad(String p, String u) {
        //base condition
        if (u.isEmpty()){
            System.out.println(p);
            return;
        }
        int n = u.charAt(0)-'0';
        for (int i= (n-1)*3; i<(n*3);i++){
            if(i!=26) {
                char ch = (char) ('a' + i);
                pad(p + ch, u.substring(1));
            }
        }
    }

    private static int countReturn(String p, String u) {
        //base condition
        if (u.isEmpty()){
            return 1;
        }
        int c = 0;
        int n = u.charAt(0)-'0';
        for (int i= (n-1)*3; i<(n*3);i++){
            if(i!=26) {
                char ch = (char) ('a' + i);
                c = c+countReturn(p + ch, u.substring(1));

            }
        }
        return c;
    }




}
