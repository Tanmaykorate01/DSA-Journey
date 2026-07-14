class Solution 
{
    public static int removeDuplicates(int[] nums) 
    {
        int slow =0;
        int fast = 1;
        
        
        for(fast = 1;fast<nums.length;fast++)
        {
            if(nums[slow]!=nums[fast])
            {
                slow++;
                nums[slow]= nums[fast];
            }
        }
        return slow+1;
    }
}