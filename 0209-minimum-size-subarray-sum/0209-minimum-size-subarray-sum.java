class Solution {
    public int minSubArrayLen(int target, int[] nums) 
    {
        int left = 0;
        int sum =0 ;
        int minlength = Integer.MAX_VALUE;

        for(int right= 0;right<nums.length;right++)
        {
            sum +=nums[right];
            while(sum>=target)
            {
                minlength = Math.min(minlength,right-left+1);
                sum -= nums[left];
                left++;
            }

            
        }
          if(minlength==Integer.MAX_VALUE)
                {
                return 0;
                }


                return minlength;
    
    }
}