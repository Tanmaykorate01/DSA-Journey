class Solution 
{
    public boolean isIsomorphic(String s, String t)
     {

            HashMap <Character,Character> h1 = new HashMap();
               HashMap <Character,Character> h2 = new HashMap();

               for(int i = 0;i<s.length();i++)
               {
                char char1  = s.charAt(i);
                char char2 = t.charAt(i);
                if(h1.containsKey(char1))
                {
                     if(h1.get(char1).equals(char2))
                    {
                        
                        
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    if(h2.containsKey(char2))
                    {
                        return false;
                    }
                    else
                    {
                        h1.put(char1,char2);
                        h2.put(char2,char1);

                    }
                }
               }

        return true;
    }
}