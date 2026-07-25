class Solution {
    public int climbStairs(int n) 
    {
        if(2 >= n) return n;

      //  return climbStairs(n-1) +  climbStairs(n-2);

        int stpe1 = 1;
        int stpe2= 2;

        for(int i = 3 ;i<=n;i++)
        {
            int curr = stpe1+stpe2;
            stpe1 = stpe2;
            stpe2=curr;
        }
        return stpe2;
        
    }
}