package recursion.patterns;

public class Triangle {
    public static void main(String args[]){
        trianglePattern(4,0);
        trianglePattern2(1,1);
        trianglePattern3(4,0);


    }

    private static void trianglePattern3(int row, int col) {
        if (row==0){
            return;
        }
        if (col<row){
            trianglePattern3(row, col+1);
            System.out.print("* ");
        }else {
            trianglePattern3(row-1, 0);
            System.out.println();
        }
    }

    private static void trianglePattern2(int row, int col) {
        if (row>4){
            return;
        }
        if (col<=row){
            System.out.print("* ");
            trianglePattern2(row, col+1);
        } else {
            System.out.println();
            trianglePattern2(row+1, 1);
        }
    }

    private static void trianglePattern(int row, int col) {
        //base case
        if (row==0){
            return;
        }
        if (row>col){
            System.out.print("* ");
            trianglePattern(row, col+1);
        } else{
            System.out.println();
            trianglePattern(row-1, 0);
        }
    }

}
