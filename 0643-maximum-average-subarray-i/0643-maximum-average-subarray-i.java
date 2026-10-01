class Solution {
    public double findMaxAverage(int[] nums, int k)
     {
        int r = 0;
        int l  = 0;
        int sum  = 0;
        double avg = 0;
        double max = Integer.MIN_VALUE;


        for(int i = 0;i<nums.length;i++)
        {
            if(i< k)
            {
                sum += nums[r];
                r++;
                if( i ==k-1)
                {
                     avg =(double) sum  / k;
                max = Math.max(max,avg);
                }
            }
            else 
            {
               
                sum =  sum - nums[l] + nums[r];
                l++;
                r++;
                avg =(double) sum  / k;
                max = Math.max(max,avg);
            }
        }
        return max;
    }
}