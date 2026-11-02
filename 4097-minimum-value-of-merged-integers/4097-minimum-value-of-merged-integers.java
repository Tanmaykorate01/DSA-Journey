class Solution {
    public int minMergedInteger(int[] nums) 
    {
       int minimum = Integer.MAX_VALUE;

       for(int i =0;i<nums.length-1;i+=2)
       {
            String x = String.valueOf(nums[i]);
            String y = String.valueOf(nums[i+1]);

            String con = x+y;

             minimum = Math.min(minimum,Integer.parseInt(con));

       }



       return minimum;





    }
}