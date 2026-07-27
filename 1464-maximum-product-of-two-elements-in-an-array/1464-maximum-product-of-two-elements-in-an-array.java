class Solution {
    public int maxProduct(int[] nums) 
    {
        int max1 = 0;
        int max2 = 0;

        for (int n : nums)
        {
            max2 = Math.max(max2, Math.min(n, max1));
            max1 = Math.max(max1, n);
        }

        return (max2 - 1) * (max1 - 1);
    }
}