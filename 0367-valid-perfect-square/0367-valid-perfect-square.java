class Solution {
    public boolean isPerfectSquare(int num) 
    {

        long first  = 0;
        long last  = num;
    
        while(first <= last)
        {
            long mid  = (first +last)/2;
            long sqr  = mid * mid;
            if(sqr== num)
            {
                return true;
            }
            else
            {
                if(sqr <num)
                {
                    first = mid+1;
                }
                else
                {
                    last  = mid -1 ;

                }
            }

        }
        return false;
        
    }   
}