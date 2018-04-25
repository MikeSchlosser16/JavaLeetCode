/*
You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells). The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

Example:

[[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]

Answer: 16
*/


class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;

        int islands = 0; // Total number of land squares, we will then use neighbors to remove from total accordingly
        int neighbors = 0; // The number of sides that we don't add to perimiter -- they are connected by land

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(grid[i][j] == 1){
                    // We have an 'island', is a 1 in the matrix
                    islands++;

                    if(i < grid.length - 1 && grid[i + 1][j] == 1) neighbors++; // Down neighbors
                    if(j < grid[i].length - 1 && grid[i][j+1] == 1) neighbors++; // Right neighbors
                }

            }
        }
    return (islands * 4) - (neighbors * 2);
    }
}



// Can also do this with Depth First search
// https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/tutorial/
public class Solution {
    public int islandPerimeter(int[][] grid) {
        if (grid == null) return 0;
        for (int i = 0 ; i < grid.length ; i++){
            for (int j = 0 ; j < grid[0].length ; j++){
                if (grid[i][j] == 1) {
                    return getPerimeter(grid,i,j);
                }
            }
        }
        return 0;
    }

    public int getPerimeter(int[][] grid, int i, int j){
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {return 1;}
        if (grid[i][j] == 0) {
            return 1; // Edge
        }
        if (grid[i][j] == -1) return 0; // Have already visited

        int count = 0;
        grid[i][j] = -1; //have already visited

        count += getPerimeter(grid, i-1, j); // Left one, recursively search
        count += getPerimeter(grid, i, j-1); // Down one, recursively search
        count += getPerimeter(grid, i, j+1); // Up one, recursively search
        count += getPerimeter(grid, i+1, j); // Right one, recursively search

        return count;

    }
}
