class Solution {
    public boolean wordPattern(String pattern, String s) 
    { 
        String words[]  = s.split(" ");

        HashMap<Character,String> h1 = new HashMap();
        HashMap<String,Character> h2 = new HashMap();


               if(pattern.length()<words.length || pattern.length()>words.length)
               {
                return false;
               } 



            for(int i = 0;i <pattern.length();i++)
            {
                char pat = pattern.charAt(i);
                String word = words[i];


                if(h1.containsKey(pat))
                {
                    if(h1.get(pat).equals(word))
                    {
                        
                        
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    if(h2.containsKey(word))
                    {
                        return false;
                    }
                    else
                    {
                        h1.put(pat,word);
                        h2.put(word,pat);
                    }
                }
            }
            return true;
    }
}