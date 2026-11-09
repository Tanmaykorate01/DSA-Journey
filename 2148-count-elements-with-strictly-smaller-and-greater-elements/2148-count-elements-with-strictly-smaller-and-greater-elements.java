class Solution {
    public int countElements(int[] nums) 
    {
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;



      for(int i=0;i<nums.length;i++)
      {
        if(nums[i] >  max)
        {
            max = nums[i];
        }
      }  

       for(int i=0;i<nums.length;i++)
      {
        if(nums[i] <  min)
        {
            min = nums[i];
        }
      }  


      int count  = 0;


      for(int n : nums)
      {
        if(n < max && n > min)
        {
            count++;
        }
      }


      return count;
    }
}