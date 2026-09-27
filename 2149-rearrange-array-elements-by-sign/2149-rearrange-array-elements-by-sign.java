class Solution {
    public int[] rearrangeArray(int[] nums) 
    {
        int pos = 0;
        int nev  = 1;
        int result[]  = new int[nums.length];

        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i] > 0)
            {
                result[pos] = nums[i];
                pos+=2;

            }
            else if(nums[i] < 0)
            {
                result[nev] = nums[i];
                nev += 2;
            }
        }

        return result;
        
    }
}