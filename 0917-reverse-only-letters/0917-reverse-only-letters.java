class Solution {
    public String reverseOnlyLetters(String s) 
    {
        
        int left = 0 ;
        int right = s.length()-1;
        StringBuilder  ans = new StringBuilder(s);

        if(s.length() == 0)
        {
            return s;
        }


        while(left < right)
        {
            char LeftChar = s.charAt(left);
            char RightChar = s.charAt(right);


            if(!Character.isLetter(LeftChar))
            {
                left++;
                continue;
            }

            if(!Character.isLetter(RightChar))
            {
                right--;
              continue;
            }


            if (Character.isLetter(LeftChar) && Character.isLetter(RightChar))
            {
                ans.setCharAt(left,RightChar);
                ans.setCharAt(right,LeftChar);

                left++;
                right--;

            }



        }

      
            return ans.toString();

        
    }
}