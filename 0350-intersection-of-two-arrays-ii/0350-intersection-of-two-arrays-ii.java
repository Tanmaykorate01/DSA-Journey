class Solution 
{
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        HashMap <Integer,Integer> map = new HashMap();
       List<Integer> ans1 = new ArrayList();

        for(int n: nums2)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }


        for(int i =0;i<nums1.length;i++)
        {
            if(map.containsKey(nums1[i]) && map.get(nums1[i])> 0 )
            {
                ans1.add(nums1[i]);
                map.put(nums1[i],map.getOrDefault(nums1[i],0)-1);
            }
        }

       int ans[] = new int[ans1.size()];

      int j = 0;

      for(int n : ans1)
      {
        ans[j] = n;
        j++;     
         }

         return ans;

    }
}