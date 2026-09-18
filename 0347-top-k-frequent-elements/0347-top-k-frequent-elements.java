class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap <Integer,Integer> map = new HashMap();
        int result[] = new int[k];

        for(int i = 0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
       List<Map.Entry<Integer,Integer>> list1 = new ArrayList(map.entrySet()); 

        list1.sort((a, b) -> b.getValue() - a.getValue());

        
        for(int i = 0;i<k;i++)
        {
            result[i] = list1.get(i).getKey();
        }

        return result;

    }
}