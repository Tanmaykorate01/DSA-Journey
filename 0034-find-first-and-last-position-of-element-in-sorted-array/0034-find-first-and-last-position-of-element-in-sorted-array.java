class Solution 
{
    public int[] searchRange(int[] nums, int target) 
    {
           System.out.println("ans retunrned");
        return  new int[]
        {
                LeftSearch(nums, target),
                 RightSearch(nums, target)

        };

    }


    private static  int LeftSearch(int nums[],int target)
    {
        int beg = 0;
        int end = nums.length - 1;
        int ans = -1;

        while(beg<=end)
        {
            int mid = beg+(end - beg)/2;
            if (nums[mid] == target)
            {
                ans = mid;
                end = mid -1;

            }
            else if (nums[mid]<target)
            {
                beg = mid +1;
            }
            else
            {
                end = mid -1;
            }
        }
        return  ans;
    }

    private static  int RightSearch(int nums[],int target)
    {
        int beg = 0;
        int end = nums.length - 1;
        int ans = -1;

        while(beg<=end)
        {
            int mid = beg+(end - beg)/2;
            if (nums[mid] == target)
            {
                ans = mid;
                beg = mid +1;

            }
            else if (nums[mid]<target)
            {
               beg = mid+1;
            }
            else
            {
                end = mid -1;
            }
        }
        return  ans;
    }

    
}
