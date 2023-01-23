package recursion.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPaths {
    public static void main(String args[]) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[board.length][board[0].length];
        System.out.println(allPathsRet(board, "", 0, 0));
        allPaths(board, "", 0, 0);
        allPathsWithNo(board, path, 1, "",0, 0);

    }

    private static void allPaths(boolean[][] maze, String p, int r, int c) {
        if (r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return ;
        }
        if (!maze[r][c]){
            return;
        }
        maze[r][c]=false;

        if(r<maze.length-1) {
            allPaths(maze, p+'D', r + 1, c);
        }
        if (r>0) {
            allPaths(maze, p+'U', r-1, c);
        }
        if (c<maze[0].length-1) {
            allPaths(maze, p+'R', r, c + 1);
        }
        if (c>0) {
            allPaths(maze, p+'L', r, c - 1);
        }
        maze[r][c]=true;
    }


    private static void allPathsWithNo(boolean[][] maze, int[][] path, int step, String p, int r, int c) {
        if (r==maze.length-1 && c==maze[0].length-1){
            path[r][c]= step;
            for (int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return ;
        }
        if (!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        path[r][c]= step;

        if(r<maze.length-1) {
            allPathsWithNo(maze, path,step+1,p+'D', r + 1, c);
        }
        if (r>0) {
            allPathsWithNo(maze, path, step+1,  p+'U', r-1, c);
        }
        if (c<maze[0].length-1) {
            allPathsWithNo(maze, path, step+1, p+'R', r, c + 1);
        }
        if (c>0) {
            allPathsWithNo(maze, path, step+1, p+'L', r, c - 1);
        }
        maze[r][c]=true;
        path[r][c] = 0;
    }


    private static ArrayList<String> allPathsRet(boolean[][] maze, String p, int r, int c) {
        if (r==maze.length-1 && c==maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> result = new ArrayList<>();
        if (!maze[r][c]){
            return result;
        }

        maze[r][c]=false;

        if(r<maze.length-1) {
            ArrayList<String> down = allPathsRet(maze, p+'D', r + 1, c);
            result.addAll(down);
        }
        if (r>0) {
            ArrayList<String> right = allPathsRet(maze, p+'U', r-1, c);
            result.addAll(right);
        }
        if (c<maze[0].length-1) {
            ArrayList<String> right = allPathsRet(maze, p+'R', r, c + 1);
            result.addAll(right);
        }
        if (c>0) {
            ArrayList<String> left = allPathsRet(maze, p+'L', r, c - 1);
            result.addAll(left);
        }

        maze[r][c]=true;
        return result;
    }
}
