package com.saket.leetcode.lockdown;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfIslands {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int rows = Integer.parseInt(br.readLine());
        int cols = Integer.parseInt(br.readLine());

        char[][] grid = new char[rows][cols];

        for(int i=0; i<rows; i++){

            for(int j=0; j<cols; j++){

                grid[i][j] = (char) br.read();
            }
        }

        System.out.println("Number of Islands: " + numIslands(grid));

    }

    public static int numIslands(char[][] grid) {

        if(grid.length == 0) {
            return 0;
        }
        int row = grid.length;
        int col = grid[0].length;

        if(row == 0 && col == 0){
            return 0;
        }

        int numOfIslands = 0;

        for(int i=0; i<row; i++){

            for(int j=0; j<col; j++){

                if(grid[i][j] == '1'){

                    markCurrentIsland(grid, i, j, row, col);
                    numOfIslands++;
                }

            }

        }

        return numOfIslands;
    }

    public static void markCurrentIsland(char[][] grid, int i, int j, int row, int col){

        if(i<0 || i>=row || j<0 || j>=col || grid[i][j] != '1'){
            return;
        }

        grid[i][j] = '2';

        markCurrentIsland(grid, i, j-1, row, col);
        markCurrentIsland(grid, i, j+1, row, col);
        markCurrentIsland(grid, i+1, j, row, col);
        markCurrentIsland(grid, i-1, j, row, col);

    }

}
