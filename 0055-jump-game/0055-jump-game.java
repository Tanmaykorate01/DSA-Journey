class Solution {
    public boolean canJump(int[] nums) 
    {

    int jumpval = nums[0];
    for(int jump = 0; jump <nums.length;jump++)
    {
        if(jump>jumpval)
        {
            return false;
        }

        if(jumpval < jump+nums[jump])
        {
            jumpval = jump +nums[jump];
        }

        if(jumpval >=  nums.length-1)
        {
        return true;
        }

    }
    return true;
        
    }
}