class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        HashMap <Integer,Integer> h1 = new HashMap();

        for(int i =0;i<nums.length;i++)
        {
            if(h1.containsKey(nums[i]))
            {
                int previousindex = h1.get(nums[i]);
                int ans =  i - previousindex;


                if(ans <= k)
                {
                    return true;
                }
                else
                {
                   h1.put(nums[i],i);
                }
            }
            else
            {
                h1.put(nums[i],i);
            }
        }
        return false;
    }
}