class Solution {
    public int countEven(int num)
     {
        int count  = 0;
        for(int i=1;i <= num;i++)
        {
            int val = i;
            int sum = 0;
            while(val!=0)
            {
                int digit = val % 10;
                sum +=digit;
                val = val /10;

            }
            if(sum % 2 ==0)
            {
                count++;
            }
        }
        return count;
    }
}