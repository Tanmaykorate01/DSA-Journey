class Solution {
    public boolean isPrefixString(String s, String[] words)
    {
        StringBuilder ans = new StringBuilder();

        for(String val: words)
        {
            ans.append(val);
            if(ans.toString().equals(s))
        {
            return true;
        }
        }

        

        if(ans.length()>s.length())
        {
            return false;

        }

       
        
        return false;
    }
}