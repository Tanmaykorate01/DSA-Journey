class Solution 
{
    public int dominantIndices(int[] nums)
     {
        int count =0;
        for(int i = 0;i<nums.length;i++)
        {
            int n  = nums[i];
            int sum = 0;
           
            int p = 0 ;

            for(int j = i+1;j<nums.length;j++)
            {
                sum+=nums[j];
                p++;
                
            }
                if (p > 0) 
                {
                    double avg = (double) sum / p;

                        if (n > avg)
                        {
                            count++;
                        }
                    }
        }    

        return count;

     }

}
