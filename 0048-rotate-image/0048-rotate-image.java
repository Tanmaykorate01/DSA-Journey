class Solution {
    public void rotate(int[][] matrix) 
    {
        int n = matrix.length;
        //i for row
        for(int i =0;i<n;i++)
        {
            for(int j= i+1;j<n;j++)
            {
                int temp = matrix[i][j] ;
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int row = 0;row<n;row++)
        {
            int left = 0;
            int right = matrix.length-1;


            while(left<right)
            {
                int temp = matrix[row][left];
                matrix[row][left] = matrix[row][right];
                matrix[row][right] = temp;

                left++;
            right--;
            }
            
        }
        
    }
}