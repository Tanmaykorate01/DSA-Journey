class Solution {
    public boolean containsDuplicate(int[] nums)
     {
        HashMap <Integer,Integer> h1 = new HashMap();

        for(int i = 0;i<nums.length;i++)
        {
            if(h1.containsKey(nums[i]))
            {
                return true;
            }
            else
            {
                h1.put(nums[i],i);
            }

        }
        return false;
    }
}