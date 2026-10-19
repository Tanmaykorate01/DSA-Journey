class Solution {
    public String addSpaces(String s, int[] spaces) 
    {
        StringBuilder ans = new StringBuilder();
        int j = 0;
        for(int i = 0;i<s.length();i++)
        {
            if( j < spaces.length && i == spaces[j] )
            {
                ans.append(" ");
                 ans.append(s.charAt(i));
                j++;
            }
            else
            ans.append(s.charAt(i));
        }

        return ans.toString();
    }
}