class Solution {
    public List<Integer> findDuplicates(int[] nums)
    {
       HashMap<Integer,Integer> map = new HashMap();
       List<Integer> ans = new ArrayList();
      

       for( int n : nums)
       {
        map.put(n,map.getOrDefault(n,0)+1);
       } 

       for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            int key = entry.getKey();
            int feq = entry.getValue();

                if(feq==2)
                {
                    ans.add(key);
                }

            }

      

        return ans;

    }
}