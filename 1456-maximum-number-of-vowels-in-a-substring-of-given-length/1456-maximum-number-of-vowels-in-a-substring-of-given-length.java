class Solution {
    public int maxVowels(String s, int k) 
    {

        int left  = 0;
        int vowelscount = 0;
        int max = 0;
        

        for(int i = 0;i<s.length();i++)
        {
            if(i < k)
            {
                if (s.charAt(i) == 'a' || 
                    s.charAt(i) == 'e' || 
                    s.charAt(i) == 'i' || 
                    s.charAt(i) == 'o' || 
                    s.charAt(i) == 'u')
                    {
                        vowelscount++;
                    }
                    if(i ==k-1)
                        {
                            max = Math.max(max,vowelscount);
                        }
            }
            else
            {
               if (s.charAt(left) == 'a' || 
                    s.charAt(left) == 'e' || 
                    s.charAt(left) == 'i' || 
                    s.charAt(left) == 'o' || 
                    s.charAt(left) == 'u')
                    {
                        vowelscount--;
                    }
    
                left++;
                
                 if (s.charAt(i) == 'a' || 
                    s.charAt(i) == 'e' || 
                    s.charAt(i) == 'i' || 
                    s.charAt(i) == 'o' || 
                    s.charAt(i) == 'u')
                    {
                         vowelscount++;
                    }
                    


                    max = Math.max(max,vowelscount);


            }
            
        }

        return max;
        
    }
}