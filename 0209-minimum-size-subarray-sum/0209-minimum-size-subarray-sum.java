class Solution {
    public int minSubArrayLen(int target, int[] nums) 
    {
        int sum = 0;
        int left = 0;
        int max = Integer.MAX_VALUE;


        for(int i = 0;i<nums.length;i++)
        {
            sum+=nums[i];

            while(sum>=target)
            {
                max = Math.min(max, i -left+1);
                  sum-=nums[left];
            left++;
            }

           
        }  
        if(max == Integer.MAX_VALUE)
           {
            return  0;
           }

        return max;
    }
}