package recursion;

public class ProductDigit {
    public static void main(String args[]){
        System.out.println(productDigit(1234 ));
    }
    public static int productDigit(int n){
        //base case
        if (n%10==n){
            return n;
        }
        return (n%10) * productDigit(n/10);
    }

}
