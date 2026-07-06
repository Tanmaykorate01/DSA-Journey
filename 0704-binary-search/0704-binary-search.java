class Solution 
{
    public int search(int[] nums, int target) 
    {
        int n = nums.length;
        int beg = 0;
        int end = nums.length -1;
        int pos =-1;
        int mid = (beg + end)/2;

        while(beg<=end)
        {
            mid = (beg+end)/2;
            if(nums[mid]==target)
            {
                pos =  mid;
                break;
            }
            else if(target>nums[mid])
            {
                beg = mid +1;
            }
            else
            {
                end = mid -1;
               
            }
        }
        return pos;
    }
    
}