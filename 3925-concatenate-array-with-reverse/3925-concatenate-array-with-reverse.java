class Solution {
    public int[] concatWithReverse(int[] nums)
    {
        List<Integer>  l1 = new ArrayList<>();
        for (int val :nums)
        {
            l1.add(val);
        }
        List<Integer> l2 = new ArrayList<>();
        for (int i = nums.length-1;i>=0;i--)
        {
            l2.add(nums[i]);
        }

        l1.addAll(l2);

        return l1.stream().mapToInt(Integer::intValue).toArray();
        
    }
}