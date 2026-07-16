class Solution {
    public double findMaxAverage(int[] nums, int k) 
    {

        int left =0;
        int sum = 0;
        int maxSum = 0;
        double average = 0.0;

        for(int i = 0;i<k;i++)
        {
            sum = sum + nums[i];
        }


        maxSum = sum;

        for(int right = k;right<nums.length;right++)
        {
            sum = sum - nums[left] + nums[ right];
            left++;
            maxSum = Math.max(maxSum,sum);
        }

            average = (double) maxSum/k;


        return average ;
    }
}