class Solution {
    public int singleNumber(int[] nums)
     {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums)
        {

                map.put(n,map.getOrDefault(n,0)+1);

        }
        for (int m : nums)
        {
            if (map.get(m) ==1)
            {
                return m;

            }
        }
        return  -1;
    }
}