class Solution {
    public boolean isGood(int[] nums)
     {
        int n  = nums.length-1;

       
        int freq[] = new int[n+1];
        for(int val: nums)
        {
            if(val<1 || val > n)
            {
                return false;
            }

                freq[val]++;
            
        }

        for(int i = 1;i<n;i++)
        {
            if(freq[i] != 1)
            {
                    return false;
            }
        }


        return freq[n] ==2;
        
    }
}