class Solution {
    public int countGoodSubstrings(String s)
    {
        int left  = 0;
        int count = 0 ;

        for(int i=0;i<s.length();i++)
        {
            if(i -left +1  > 3)
            {
                left++;
            }

            if(i-left+1 == 3)
            {
                if (s.charAt(left) != s.charAt(left + 1) &&s.charAt(left + 1) != s.charAt(left + 2) && s.charAt(left) != s.charAt(left + 2))
            {
                count++;
            }
            }
        }

        return count;

    }
}