package recursion;

public class MathClass {
    public static void main(String args[]){
        int n = 123;
        int digit = (int)(Math.log10(n))+1;
        int power= (int)Math.pow(10,digit);
        System.out.println(digit);
        System.out.println(power);

    }
}
