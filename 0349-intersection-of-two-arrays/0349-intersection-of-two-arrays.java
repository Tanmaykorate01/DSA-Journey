class Solution {
    public int[] intersection(int[] nums1, int[] nums2)
     {
        HashMap <Integer,Integer> h1 = new HashMap();
      
        List <Integer> ans = new ArrayList();

        for(int i =0 ;i<nums1.length;i++)
        {
            h1.put(nums1[i],i);

        }

        for(int i = 0;i<nums2.length;i++)
        {
            if(!ans.contains(nums2[i])&&h1.containsKey(nums2[i]))
            {
                ans.add(nums2[i]);
            }
        }
                        
            int[] result = new int[ans.size()];

            for (int i = 0; i < ans.size(); i++) 
            {
                result[i] = ans.get(i);
            }

return result;

        
    }
}