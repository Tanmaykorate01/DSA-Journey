class Solution {
    public int[] singleNumber(int[] nums) 
    {
           Map<Integer,Integer> h1 = new HashMap<>();
        int arr[] = new int[2];
        int i = 0;

        for (int n : nums)
        {
            h1.put(n,h1.getOrDefault(n,0)+1);
        }


        for (int m  : nums)
        {
            if(h1.get(m) ==1 )
            {
                arr[i] =  m;
                i++;
            }
        }


        return arr;
        
    }
}