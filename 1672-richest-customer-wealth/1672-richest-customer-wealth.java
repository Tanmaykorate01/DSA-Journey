class Solution {
    public int maximumWealth(int[][] accounts) 
    {
        int maxsum = Integer.MIN_VALUE;
        int jval = accounts[0].length;
        for(int i=0;i<accounts.length;i++)
        {
                int sum = 0;

            for(int j= 0;j<jval;j++)
            {
                
                sum += accounts[i][j];

               
            }
             maxsum = Math.max(sum,maxsum);

        }
        return maxsum;
        
    }
}