class Solution 
 
{
    public int mySqrt(int x) 
    {
        if (x == 0 || x == 1)
        {
            return x;
        }

        int s = 0;
        int end = x;
        int ans = -1;

        while (s <= end)
        {
            int mid = s + (end - s) / 2;

            if (mid == x / mid)
            {
                return mid;
            }
            else if (mid > x / mid)
            {
                end = mid - 1;
            }

            if (mid < x / mid)
            {
                ans = mid;
                s = mid + 1;
            }
        }

        return ans;
    }
}

             
    
            


        

     
    
