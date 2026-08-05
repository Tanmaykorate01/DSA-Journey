class Solution 
{
    public int totalMoney(int n) 
    {
        int start = 1;
        int money =  1;

        int ans = 0;

        for(int day = 1;day<=n;day++)
        {
            ans += money;
            money++;

            if(day % 7==0)
            {
                start++;
                money = start;
            }
        }
        return ans;
    }
}