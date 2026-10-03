class Solution {
    public long maximumSubarraySum(int[] nums, int k)
     {

        int left= 0;
        long sum = 0;
        long max = 0;
        HashSet<Integer> set = new HashSet();


        for(int i = 0;i<nums.length;i++)
        {
           while(set.contains(nums[i]))
           {
             sum-=nums[left];
             set.remove(nums[left]);
             left++;
           }

           sum += nums[i];
            set.add(nums[i]);

             if(i -left +1 > k)
           {
            set.remove(nums[left]);
            sum -=nums[left];
            left++;
           }

           if(i -left +1 == k)
           {
            max = Math.max(sum,max);
           }
               
        }

        return max;
    }
}