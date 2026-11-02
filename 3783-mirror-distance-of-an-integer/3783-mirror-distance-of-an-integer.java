class Solution {
    public int returnreverse(int n )
    {
          int ans = 0;
            int[] digits = Integer.toString(n)
                      .chars()
                      .map(c -> c - '0')
                      .toArray();

            
                      if(digits.length == 1)
                      {
                            return n ;
                      }
                      else
                      {
                        for(int i = digits.length-1;i>=0;i--)
                        {
                            ans = ans * 10 + digits[i];
                        }
                      }

                      return ans;

    }
    public int mirrorDistance(int n) 
    {
        int rev = returnreverse(n);

        return Math.abs(n - rev);
    }
}