class Solution {
    public boolean wordPattern(String pattern, String s) 
    {
        String words[] = s.split(" ");

        if(pattern.length()<words.length || words.length<pattern.length())
        {
            return false;
        }

        HashMap<Character,String> h1 = new HashMap();
          HashMap<String,Character> h2 = new HashMap();

          for(int i = 0;i<pattern.length();i++)
          {
            char charpattern = pattern.charAt(i);
            String word = words[i];

            if(h1.containsKey(charpattern))
            {
                if(h1.get(charpattern).equals(word))
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
                    h1.put(charpattern,word);
                    h2.put(word,charpattern);
                }
            }
          }
        return true;
    }
}