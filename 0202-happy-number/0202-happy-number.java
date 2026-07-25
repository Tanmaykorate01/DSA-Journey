class Solution 
{
    public boolean isHappy(int n)
     {
        int sum = 0;
        HashSet<Integer> h1 = new HashSet<>();
        
        while(sum !=1)
        {
             sum  = 0;

            while (n > 0)
             {
                int digit = n % 10;
                sum = sum + digit * digit;
                n = n / 10;

            }


            if (sum == 1) 
            {
                return true;

            }
            if (h1.contains(sum)) 
            {
                return false;
            } 
            else 
            {
                h1.add(sum);
                n = sum;
            }
        }
        return false;
       
    }
}