class Solution {
    public int minMoves(int[] nums)
     {
        
        int count  = 0;
       int max = Integer.MIN_VALUE;
       for(int n : nums)
       {
            if(max < n)
            {
                max  = n;
            }
       }


       for( int i =0;i<nums.length;i++)
       {
            if(nums[i]!=max)
            {
                count  += max - nums[i];
            }

       }

       return Math.abs(count);

    }
}