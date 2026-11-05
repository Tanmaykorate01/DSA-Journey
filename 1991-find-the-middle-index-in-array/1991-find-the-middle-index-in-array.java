class Solution {
    public int findMiddleIndex(int[] nums) 
    {
       int totalsum = 0;
       int leftsum = 0 ;


       for(int n : nums)
       {
        totalsum =  totalsum + n;

       }


       for(int i =0;i<nums.length;i++)
       {
        int rightsum = totalsum - leftsum - nums[i];


        if(rightsum == leftsum)
        {
            return i;
        }


        leftsum += nums[i];
       } 


       return -1;
    }
}