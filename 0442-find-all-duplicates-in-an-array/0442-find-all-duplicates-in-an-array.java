class Solution {
    public List<Integer> findDuplicates(int[] nums)
     {
       HashSet<Integer> set = new HashSet();
       List<Integer> ans = new ArrayList();

       for(int i = 0;i<nums.length;i++)
       {
        if(!set.contains(nums[i]))
        {
            set.add(nums[i]);
        }
        else
        {
            ans.add(nums[i]);
        }

       } 


       return ans;
    }
}