package recursion.backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String args[]){
       // System.out.println(count( 3, 3));
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        System.out.println(pathsWithObstacle(board, 0, 0));

       // paths("",3,3);
       // System.out.println(pathsRet("", 3, 3));
       // System.out.println(pathsRetDiagonal("", 3, 3));

    }

    private static int count(int r, int c) {
        if (r==1 || c==1){
            return 1;
        }
        int down = count(r-1, c);
        int side = count(r, c-1);

        return down+side;
    }

    private static void paths(String p, int r, int c) {
        if (r==1 && c==1){
            System.out.println(p);
            return ;
        }
        if(r>1) {
            paths(p+'D', r - 1, c);
        }
        if (c>1) {
            paths(p+'S', r, c - 1);
        }
    }

    private static ArrayList<String> pathsRet(String p, int r, int c) {
        if (r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> result = new ArrayList<>();
        if(r>1) {
            ArrayList<String> down = pathsRet(p+'D', r - 1, c);
            result.addAll(down);
        }
        if (c>1) {
            ArrayList<String> side = pathsRet(p+'S', r, c - 1);
            result.addAll(side);
        }
        return result;
    }

    private static ArrayList<String> pathsRetDiagonal(String p, int r, int c) {
        if (r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> result = new ArrayList<>();
        if (r>1 && c>1){
            ArrayList<String> dia = pathsRetDiagonal(p+'V', r - 1, c-1);
            result.addAll(dia);
        }
        if(r>1) {
            ArrayList<String> down = pathsRetDiagonal(p+'D', r - 1, c);
            result.addAll(down);
        }
        if (c>1) {
            ArrayList<String> side = pathsRetDiagonal(p+'S', r, c - 1);
            result.addAll(side);
        }
        return result;
    }

    private static int pathsWithObstacle(boolean[][] maze, int r, int c) {
        if (r==maze.length-1 && c==maze[0].length-1){
            return 1;
        }
        int count=0;
        if (!maze[r][c]){
            return 0;
        }
        if(r<maze.length-1) {
            count +=pathsWithObstacle(maze,r + 1, c);
        }
        if (c<maze[0].length-1) {
            count += pathsWithObstacle(maze, r, c + 1);
        }
        return count;
    }
}
