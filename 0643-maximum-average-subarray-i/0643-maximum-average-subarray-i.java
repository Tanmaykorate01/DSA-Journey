class Solution {
    public double findMaxAverage(int[] nums, int k) 
    {
        double sum =0;
        double avg = 0;
        int left  = 0;
        double maxavg = -Double.MAX_VALUE;

        for(int i = 0;i<nums.length;i++)
        {
            sum+=nums[i];

            if(i - left +1 > k)
            {
                sum-=nums[left];
                left++;
            }
            if(k == i - left +1)
            {
                avg = sum / k;
                maxavg =  Math.max(avg,maxavg);
            }
        }

        return maxavg;
    }
}