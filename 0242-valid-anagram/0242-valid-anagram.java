class Solution {
    public boolean isAnagram(String s, String t)
     {
        HashMap <Character, Integer> h1 = new HashMap();

        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            h1.put(ch,h1.getOrDefault(ch,0)+1);
        }

        for(int i = 0;i<t.length();i++)
        {
            char ch = t.charAt(i);
            h1.put(ch,h1.getOrDefault(ch,0)-1);
        }
        

        for(int val : h1.values())
        {
            if(val != 0)
            {
                return false;
            }
        
        }

        return true;

    }
}