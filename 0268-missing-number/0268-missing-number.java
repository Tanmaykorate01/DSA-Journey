class Solution {
    public int missingNumber(int[] nums)
     {
        int xorsum = 0;

        for(int n : nums)
        {
            xorsum =  xorsum ^ n;
        }

        int  n = nums.length;

        for(int i =0 ;i<=nums.length;i++)
        {
            xorsum ^= i;
        }

        return xorsum;
        
    }
}