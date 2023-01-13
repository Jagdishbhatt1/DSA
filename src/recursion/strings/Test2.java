package recursion.strings;

//Q1- Skip apple from a string??
//Q2- Skip app only when it is not apple??
public class Test2 {
    public static void main(String args[]){
        System.out.println(skipApple("jagdish apple app likes"));
        System.out.println();
        System.out.println(skipAppNotApple("jagdish apple app likes"));
    }

    private static String skipApple(String s) {
        if (s.isEmpty()){
            return "";
        }

        if(s.startsWith("apple")){
            return skipApple(s.substring(5));
        } else {
            return s.charAt(0) + skipApple(s.substring(1));
        }
    }

    private static String skipAppNotApple(String s) {
        if (s.isEmpty()){
            return "";
        }

        if(!s.startsWith("apple") && s.startsWith("app")){
            return skipAppNotApple(s.substring(3));
        } else {
            return s.charAt(0) + skipAppNotApple(s.substring(1));
        }
    }
}
