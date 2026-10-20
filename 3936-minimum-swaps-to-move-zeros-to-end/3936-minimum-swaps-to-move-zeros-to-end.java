class Solution {
    public int minimumSwaps(int[] nums) 
    {
        int i = 0;
        int  j = nums.length-1;
        int count  = 0;

        while(i<=j)
        {
            if(nums[i] == 0 && nums[j]!=0)
            {
                int temp = nums[i];
                nums[i] =nums[j];
                nums[j] = temp;
                i++;
                j--;
                count++;
            }
            else
            {
                if(nums[i]!=0)
                {
                     i++;
                }
               
                if(nums[j]==0)
                {
                     j--;
                }
            }
        }
        return count;
    }
}