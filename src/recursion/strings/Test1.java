package recursion.strings;


// Q- remove letter 'a' from string
public class Test1 {
    public static void main(String args[]){
       // skip("", "Jagdish");
        System.out.println(skip("jagdish"));
    }

    public static void skip(String process, String unprocess){
        if (unprocess.isEmpty()){
            System.out.println(process);
            return;
        }
        char ch = unprocess.charAt(0);
        if (ch == 'a'){
            skip(process, unprocess.substring(1));
        } else {
            skip(process +ch, unprocess.substring(1));
        }
    }

    public static String skip(String s) {
        if (s.isEmpty()) {
            return "";
        }
        char ch = s.charAt(0);
        if (ch == 's') {
          return skip(s.substring(1));
        } else {
          return  ch + skip(s.substring(1));
        }
    }
}



