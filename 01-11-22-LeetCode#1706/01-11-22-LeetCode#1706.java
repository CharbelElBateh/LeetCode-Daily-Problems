class Solution {
    public int[] findBall(int[][] grid) {
        //The following implementation follows a simple yet tricky logic.
        //We process each ball with its path
        //If we get to the last row we return the column it is in
        //During the pass of each ball we check the next cell
        //If it the next cell is 'theoretically' outside of the box the ball is stuck on the borders
        //If the next cell forms a 'V' shape with the current cell the ball is stuck between them
        //If it is valid proceed to the next row until it reaches the end
        
        //Basic place holders
        int rows = grid.length;
        int cols = grid[0].length;
        
        //Output
        int[] output = new int[cols];

        //Processing each ball
        for(int i = 0; i < cols; i++ ){
            output[i] = solve(grid, i, 0);
        }
        
        return output;
    }
    
    private int solve(int[][] grid, int col, int row){
        //If the ball reaches the end, we return the column
        if (row == grid.length) return col;
        
        //if the cell is -1 it will go to right 
        //if the cell is 1 it will go to left
        int nextColumn = col + grid[row][col];
        
        //if the next cell falls outside the matrix from the right
        if (nextColumn < 0 
            //or the left
            ||nextColumn > grid[0].length - 1 
            //or if they form a 'V' shape that occurs when we have a (1, -1) sequence or (-1, 1)
            ||grid[row][col] != grid[row][nextColumn]) {
            
            //Then the ball is stuck
            return -1;
        }
        
        //Else proceed to the next row
        return solve(grid, nextColumn, row + 1); 
    }
        
}