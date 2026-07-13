class Solution {
    public boolean isPalindrome(String s) 
    {
        int left =0;
        int right = s.length()-1;
        Boolean result = true;
        while(left<right)
        {
           
            if(!Character.isLetterOrDigit(s.charAt(left)))
            {
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(right)))
            {
                right--;
                continue;
            }


            char l = Character.toLowerCase(s.charAt(left));
            char r = Character.toLowerCase(s.charAt(right));


            if(l!=r)
            {
                return result =false;
            }
            left++;
            right--;
        }

        return result;
    }
}