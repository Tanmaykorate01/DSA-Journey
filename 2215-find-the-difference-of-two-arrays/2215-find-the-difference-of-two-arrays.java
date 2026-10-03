class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2)
     {
       HashSet<Integer> set1 = new HashSet();
       HashSet<Integer> set2 = new HashSet();

       List<Integer> ans1 = new ArrayList();
       List<Integer> ans2 = new ArrayList();

       List<List<Integer>> output = new ArrayList();


       for(int n : nums1)
       {
        set1.add(n);
       }
        for(int n : nums2)
       {
        set2.add(n);
       }

       for(Integer n : set1)
       {
        if(!set2.contains(n))
        {
            ans1.add(n);
        }
       }

       for(Integer n :set2)
       {
        if(!set1.contains(n))
        {
            ans2.add(n);
        }
       }


       output.add(ans1);
       output.add(ans2);

       return output;

    }
}