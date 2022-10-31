//LeetCode#1293 Shortest Path in a Grid with Obstacles Elimination
class Solution {
    public int shortestPath(int[][] grid, int k) {
        //The implementation is based on Breadth First Short to find the shortest path within a matrix
        //We first start with starting cell (0,0) and finish on the destination (rows-1,cols-1)
        //Decrementing k on each obstacle we meet and taking into consideration only valid cells and paths with k>=0
        
        
        //Place Holders for number of rows and columns
        int rows = grid.length, cols = grid[0].length;
        //Boolean Array that will indicate if the cell was already visited by other origins
        boolean[][][] visited = new boolean[rows][cols][k + 1];
        
        //The queue interface is implemented by linkedlist
		Queue<int[]> Q = new LinkedList<>(); 
        //Starting point of the matrix
        Q.add(new int[]{0, 0, k});
		//x coordinates, y coordinates, k remaining obstacles
     
        //Number of steps counter
        int resultingSteps = 0;
        
        //Breadth First Search Algorithm
        while(Q.size() > 0){
            int size = Q.size();
			
            while(size-- > 0){
                
                //Getting the elements one by one and visiting their neighbors
                int[] rem = Q.poll();
                int x = rem[0];
                int y = rem[1];
                int remainingObstacles = rem[2];
                
                //If we reached the end of the matrix with no-or-remaining obstacles
                if(x == rows - 1 && y == cols - 1 && remainingObstacles >= 0)  
                    //return the resulting number of steps
                    return resultingSteps;
                
                //If the current cell is already visited there is no need to keep computing
                if(remainingObstacles < 0 || visited[x][y][remainingObstacles] == true)  
                    continue;
                
                //Tagging the cell as visited
                visited[x][y][remainingObstacles] = true;
                
                //The possibility implied in the next 4 if's means that the cell referenced does not fall outside the matrix
                
                //Visiting the upper cell if it is possible
                if(x - 1 >= 0){
                    //x coordinates, y coordinates, remaining obstacles - the number in the new cell since 1 represents an obstacle
                    Q.add(new int[]{x - 1, y, remainingObstacles - grid[x - 1][y]});
                }
    
                //Visiting the lower cell if it is possible
                if(x + 1 < rows){
                    Q.add(new int[]{x + 1, y, remainingObstacles - grid[x + 1][y]});
                }
                
                //Visiting the left cell if it is possible
                if(y - 1 >= 0){
                    Q.add(new int[]{x , y - 1, remainingObstacles - grid[x][y - 1]});
                }
                
                //Visiting the right cell if it is possible
                if(y + 1 < cols){
                    Q.add(new int[]{x , y + 1, remainingObstacles - grid[x][y + 1]});
                }
            }
            
            //Increment the steps when finished
            resultingSteps++;
        }
        
        //Reaching here means no passage was found with current k value
        return -1;
        
    }
}