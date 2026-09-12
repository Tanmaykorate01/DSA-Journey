class Solution
 {
    public boolean isHappy(int n)
     {
            HashSet<Integer>  h1 = new HashSet();

        while(n!=0)
        {
        
                int sum  = 0;
            while(n!=0)
            {
                int digit = n % 10;
                int sqr = digit * digit;
                n  =  n / 10;
                sum += sqr;

            }
            n = sum;
            if(n ==1)
            {
                return true;
            }
            else
            {
                if(h1.contains(n))
                {
                    return false;
                }
                  else
            {
                h1.add(n);
            }
            }
          
        }
return false;
            
     }
}