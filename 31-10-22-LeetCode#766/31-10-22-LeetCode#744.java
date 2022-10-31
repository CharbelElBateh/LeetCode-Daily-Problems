//LeetCode#766 Toeplitz Matrix
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        //This implementation is based on looking on top-left neighbors and comparing values

        //Place holders for the numbers of rows and columns
        int row = matrix.length;
        int col = matrix[0].length;
        
        //If the matrix is horizontal or vertical then, by default, it is toeplitz
        if(row == 1 || col == 1) 
            return true;
        
        //Looping through each cell starting from row 1 and or col 1 so the specified neighbor is not valid
        for(int i = 1; i < row; i++)
            for(int j = 1; j< col; j++)
                if(matrix[i-1][j-1] != matrix[i][j])
                    return false;
        
        //if no invalid neighbors were found then it is a toeplitz matrix
        return true;
    }
}