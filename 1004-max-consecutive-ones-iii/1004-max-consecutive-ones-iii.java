class Solution {
    public int longestOnes(int[] nums, int k) 
    {
        int left = 0;
        
        int max = 0;
        int zero = 0;
        int len = 0;

        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i] == 0)
            {
                zero++;

                if(zero<=k)
                {
                        len  = i - left +1;
                        max = Math.max(len,max);
                       
                    
                    
                }
                else
                {
                    while(zero > k)
                    {
                        if(nums[left] == 0)
                        {
                            zero--;
                        }
                        left++;
                    }

                    len = i - left +1;
                    max = Math.max(len,max);
                }
            }
            else
            {
                        len = i - left +1;
                        max = Math.max(max,len);
            }

        }
        

        return max;
    }
}