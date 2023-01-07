package recursion;

public class Factorial {

    public static void main(String args[]){
        System.out.println(fac(5));
    }

    //similar for sum of n numbers
    private static int fac(int n) {
        //base case
        if(n==1){
            return 1;
        }
        return n*fac(n-1);
        //return n+fac(n-1);
    }
}
