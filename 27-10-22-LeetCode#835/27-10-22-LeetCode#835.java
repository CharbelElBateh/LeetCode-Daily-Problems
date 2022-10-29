//LeetCode#835 Image Overlap
class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        //This implementation is based on shifting img1 on different offsets and finds the maximum overlapping ones
        //This is done by shifting the img1 from -N+1 to 2N-1 over im2 in rows and in columns starting in columns
        //So we go up in columns 1 by 1 & in rows too until we reach the last overlapping elements
        //-N+1 because starting from -N would be useless since there would be no overlapping number at all
        //Same logic goes for 2N-1
        //Representation of the logic for 2N
        //         [[1, 1, 0],
        //          [0, 1, 0],
        //          [0, 1, 0]]
        //[[0, 0, 0],
        // [0, 1, 1],
        // [0, 0, 1]]
        // 0  ... N  N+1 ... 2N
        //Same goes for -N
        
        //Number of overlapping 1's in the matrices
        int largestOverlap = 0;
        
        //Shifting the rows 1 by 1
        for(int i = -img1.length + 1; i < img1.length; i++){
            
            //Shifting the columns 1 by 1
            for(int j = -img2.length + 1; j < img2.length; j++){
                
                //For each shift check the number of overlapping ones
                largestOverlap = Math.max(largestOverlap, getOverlappedOnes(img1, img2, i, j));
                
            }
        }
        
        //Output
        return largestOverlap;
    }
    
    //Helper method returning number of overlapping 1's with the current offset parameters
    private int getOverlappedOnes(int[][] A, int[][] B, int rowOffset, int columnOffset){
        
        //Placeholder for overlapping 1's
        int numbOfOverlappingOnes = 0;
        
        //Looping through the rows of the offsetted matrix
        for(int i = 0; i < A.length; i++){
            
            //Looping through the columns of the offsetted matrix
            for(int j = 0; j < A[0].length; j++){
                
                //Let's break this for loop
                if(
                    //if we are in a row that is not overlapping the matrix
                    //We are either before the actual matrix || or after it
                    ((i + rowOffset) < 0 || (i + rowOffset) >= A.length)  
                    //Same logic for the columns
                    //We are either blow the actual matrix || Or over it
                    || ((j + columnOffset) < 0 || (j + columnOffset) >= A[0].length)){
                    
                    //We do not need to check for overlapping ones
                    continue;
                }
                //This will run if we are in the area where both matrices overlap 
                //We need to check if they are both 1's ==> their sum is 2
                //And since the origin of the "axises" is the offsetted matrice
                //The coordinates of the second matrices needs to include the offsets of each rows and columns
                if(A[i][j] + B[i + rowOffset][j + columnOffset] == 2)
                    numbOfOverlappingOnes++;
            }
        }
        
        //output
        return numbOfOverlappingOnes;
    }
}