package practice;

import java.util.*;

public class P1 {
    public static void main(String args[]) {
        int c = finalt();
        System.out.println(c);
    }


    public static int finalt(){
        try {
            int a = 5;
            int c = 5 / 3;
            return c;
        } catch (Exception e) {
            System.out.println("divide by zero");
        }
        finally {
            System.out.println("finally-----------------------");
        }
        System.out.println("after finally");
        return 0;
    }

}

