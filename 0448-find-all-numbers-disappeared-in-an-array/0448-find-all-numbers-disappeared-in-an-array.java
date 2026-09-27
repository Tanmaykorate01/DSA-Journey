class Solution 
{
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        
        Arrays.sort(nums);
       int n = nums.length;
        HashSet<Integer> hash = new HashSet();
        List<Integer> ans = new ArrayList();
        for(int m : nums)
        {
            hash.add(m);
        }

        for(int i = 1;i<=n;i++)
        {
            if(!hash.contains(i))
            {
                ans.add(i);
            }
        }

        return ans;

    }
}