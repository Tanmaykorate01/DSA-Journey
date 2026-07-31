class Solution {
    public boolean isPalindrome(String s) 
    {
        int start= 0;
        int e = s.length()-1;



        while (start<e)
        {


                if (!Character.isLetterOrDigit(s.charAt(start)))
                {
                    start++;
                    continue;
                }

                if (!Character.isLetterOrDigit(s.charAt(e)))
                {
                    e--;
                    continue;
                }


                char  l = Character.toLowerCase(s.charAt(start));
                char  p = Character.toLowerCase(s.charAt(e));

                if (l!=p)
                {
                    return false;
                }

            start++;
            e--;

        }

        return true;

        
    }
}