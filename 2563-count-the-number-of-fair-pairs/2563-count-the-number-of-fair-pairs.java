class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) 
    {
        long uppercount  = 0;
        long lowercount = 0;
        int left  = 0;
        int right = nums.length-1;
       Arrays.sort(nums);

       
            while(left < right)
            {
                
                if(nums[left] + nums[right] <= upper )
                {
                    uppercount += right-left;
                    left++;
                }
                else
                {
                    right--;
                }
            }
            
            left  = 0;
        right = nums.length-1;


         while(left < right)
            {
                
                if(nums[left] + nums[right] < lower )
                {
                    lowercount += right-left;
                    left++;
                }
                else
                {
                    right--;
                }
            }
    

        return uppercount - lowercount ;
        
    }
}