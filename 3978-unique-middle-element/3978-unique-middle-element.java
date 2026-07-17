class Solution 
{
    public boolean isMiddleElementUnique(int[] nums)
     {
        int mid = nums.length/2;
        int count  =0;

        for(int i=0;i<nums.length;i++)
        {
            if(i!=mid && nums[i] ==nums[mid])
            {
                return false;
               
            }
        }   
        return true;   
    }
}