class Solution {
    public List<Integer> spiralOrder(int[][] matrix)
     {
        int m =  matrix.length;
        int n = matrix[0].length;

        List<Integer> Output = new ArrayList();

        int startrow = 0;
        int endcol = n-1;
        int startcol = 0;
        int endrow = m-1;


        while(startrow<=endrow && startcol<= endcol)
        {
            for(int col = startcol;col<=endcol ;col++)
            {
                Output.add(matrix[startrow][col]);
            }
            startrow++;

            for(int row = startrow;row<=endrow;row++)
            {
                Output.add(matrix[row][endcol]);
            }
            endcol--;

if(startrow<=endrow)
{
for(int col = endcol ; col>=startcol;col--)
            {
                Output.add(matrix[endrow][col]);
            }
            endrow --;
}
            


if(startcol<=endcol)
{
            for(int row = endrow ; row>=startrow;row--)
            {
                Output.add(matrix[row][startcol]);
            }
            startcol++;
}
        }

        return Output;
        
    }
}