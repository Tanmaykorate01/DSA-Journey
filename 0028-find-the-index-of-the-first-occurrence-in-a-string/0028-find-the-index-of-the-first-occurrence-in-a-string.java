class Solution {
    public int strStr(String haystack, String needle)
     {

        int i = 0;
        int j = 0;


        if(needle.length() == 0)
        {
            return i;
        }

        while(i<haystack.length())
        {
            while(j<needle.length())
            {
                if(i+j<haystack.length() && haystack.charAt(i+j) == needle.charAt(j))
                {
                    j++;
                }
                else
                {
                    j = 0;
                    i++;
                    break;
                }
            }
            if(j == needle.length())
                {
                    return  i;
                }
        }
        


        return -1;
    }
}