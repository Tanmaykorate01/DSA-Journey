class Solution {
    public boolean containsDuplicate(int[] nums) 
    {

        HashMap<Integer,Integer> h1 = new HashMap();


        for(int n: nums)
        {
            h1.put(n,h1.getOrDefault(n,0)+1);
        }

        for(int i = 0;i<nums.length;i++)
        {
            if(h1.get(nums[i]) >  1)
            {
                return true;
            }
        }
        return false;
    }

}