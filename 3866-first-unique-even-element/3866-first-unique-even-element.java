class Solution {
    public int firstUniqueEven(int[] nums) 
    {
        int numm = 0;
       
        int[] freq = new int[1001];

            for (int num : nums) 
            {
                freq[num]++;
            }


            for(int i =0;i<nums.length;i++)
            {
                if(nums[i]% 2 ==0 && freq[nums[i]] ==1)
                {
                    return numm = nums[i];
                }
            }

            
            return numm =-1;
       
    }
}