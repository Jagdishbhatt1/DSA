package recursion;


//Number of steps to reduce a number to zero
public class ReduceToZero {
    public static void main(String args[]){
       // stepsCount(8, 0);
        System.out.println(stepsCount(14, 0));
    }

    //public static int sum=0;
    public static int stepsCount(int n, int steps){
        //base case
        if (n==0){
            //System.out.println(steps);
            return steps;
        }
        if (n%2==0){
            return stepsCount(n/2, steps+1);
        } else {
            return stepsCount(n-1, steps+1);
        }
    }

}
