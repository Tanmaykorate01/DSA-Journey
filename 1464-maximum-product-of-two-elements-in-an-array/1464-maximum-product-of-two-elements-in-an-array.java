class Solution {
    public int maxProduct(int[] nums) 
    {
        Arrays.sort(nums);
        int n= nums.length-1;
        int max = nums[n];
        int max2 = nums[n-1];

        return (max-1 )* (max2-1);
        
    }
}