class Solution {
    public static long countpairs(int nums[], int target)
    {


        long count  = 0;
        int left  = 0 ;
        int right = nums.length-1;

        while(left<right)
        {
            if(nums[left] + nums[right]<= target)
            {
                count+= right-left;
                left++;
            }
            else
            {
                right--;
            }

        }

        return count;

    }
    public long countFairPairs(int[] nums, int lower, int upper) 
    {
        Arrays.sort(nums);
        long uppercount  = countpairs(nums, upper);
        long lowercount  = countpairs(nums,lower-1);

        return uppercount - lowercount ;
        
    }
}