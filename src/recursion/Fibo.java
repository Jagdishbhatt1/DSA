package recursion;

public class Fibo {

    static public int fiboF(int n){
        if (n<2) {
            return n;
        }
            return fiboF(n-1)+fiboF(n-2);
        }


    public static void main(String args[]){

        System.out.println(fiboF(40));//taking much time for higher value of n


    }
}
