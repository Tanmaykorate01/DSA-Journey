class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
       
        int totarow = matrix.length;
        int totoalcol = matrix[0].length;

        int row = 0;
        int col =  totoalcol-1;


        while(row < totarow && col >=0)
        {
            if (matrix[row][col]== target)
            {
                return true;
            }
            else if (matrix[row][col]>target)
            {
                col--;
            }
            else
            {
                row++;
            }
        }
        return false;
        
    }
}