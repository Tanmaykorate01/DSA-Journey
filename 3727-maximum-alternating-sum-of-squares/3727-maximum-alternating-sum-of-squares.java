class Solution {
    public long maxAlternatingSum(int[] nums)
     {
        long sum = 0;
        int mid  = (int) nums.length/2;


        for(int i = 0;i<nums.length;i++)
        {
            nums[i] *=nums[i];
        }

        Arrays.sort(nums);

        for(int i=0;i<mid;i++)
        {
            sum = sum - nums[i];
        }


        for(int i =mid;i<nums.length;i++)
        {
            sum=  sum + nums[i];
        }


        return sum;

        
    }
}