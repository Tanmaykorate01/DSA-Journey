class Solution {
    public int getCommon(int[] nums1, int[] nums2)
     {
        int smallest = Integer.MAX_VALUE;
      


        HashSet<Integer> set = new HashSet();
        for(int n : nums1)
        {
            set.add(n);
        }


        for(int i = 0;i<nums2.length;i++)
        {
            if(set.contains(nums2[i]))
            {
               if(nums2[i] < smallest)
               {
                smallest = nums2[i];
               }    
            }

        }
           if( smallest == Integer.MAX_VALUE )
         {
            return -1;
         }
         else
         {
            return smallest ;
         }
    }
}