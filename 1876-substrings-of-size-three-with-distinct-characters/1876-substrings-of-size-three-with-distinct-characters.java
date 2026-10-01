class Solution {
    public int countGoodSubstrings(String s) 
    {
        int k =3;
        int left  = 0;
        int right = 0;
    int count  = 0;


        if(s.length() < 3)
        {
            return 0;
        }
    for(int i =0;i<s.length();i++)
    {
        if(i<k)
        {
            if(i==k-1)
                {
                        
           if (s.charAt(left) != s.charAt(left + 1) && s.charAt(left + 1) != s.charAt(left + 2) && s.charAt(left) != s.charAt(left + 2))
            {
                
                    count++;
            }
                }
        }
        else
        {
            left++;
            right++;

            if (s.charAt(left) != s.charAt(left + 1) &&s.charAt(left + 1) != s.charAt(left + 2) && s.charAt(left) != s.charAt(left + 2))
            {
                count++;
            }
        }  
    }
    return count;
        
    }
}