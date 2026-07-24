class Solution
 {
   public static int[]  intersection(int[] nums1, int[] nums2)
    {
        Set<Integer> arr1  = new HashSet<>();
        Set<Integer> arr2 = new HashSet<>();

       for(int n : nums1)
        {
            arr1.add(n);
        }

        for(int m : nums2)
        {
            arr2.add(m);
        }

        arr1.retainAll(arr2);

        int ans [] =new int[arr1.size()];
        int i =0 ;
        for(int n : arr1)
        {
            ans[i] = n;
            i++;
        }

        return ans;

    }
}