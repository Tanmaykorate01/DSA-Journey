class Solution {
    public boolean judgeSquareSum(int c) 
    {
        int left  = 0;
         int right = (int)Math.sqrt(c);

        // if(c==1 || c==0)
        // {
        //     return true;
        // }

    while(left<=right)
        {
            long sum  = (long) left * left + right* right;

            if(sum == c)
            {
                return true;
            }
            else if(sum<c)
            {
                left++;
            }
            else 
            {
                right--;
            }
        }

        return false;
        
    }
}