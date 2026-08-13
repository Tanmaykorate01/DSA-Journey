class Solution 
{
    public String reverseVowels(String s)
     {
        StringBuilder ans = new StringBuilder(s);
         int i = 0;
        int j =s.length()-1;

        while(i<j)
        {
            char vowel1= ans.charAt(i);
            char vowel2 = ans.charAt(j);

            if (isvowels(vowel1)&& isvowels(vowel2))
            {
                char temp = vowel1;
                vowel1 = vowel2;
                vowel2 = temp;

                ans.setCharAt(i,vowel1);
                ans.setCharAt(j,vowel2);


                i++;
                j--;
            }
            else if (!isvowels(vowel1))
           {
                i++;
           }
           else if (!isvowels(vowel2))
           {
               j--;
           }

        }
        return ans.toString();
    }

    private static boolean isvowels(char p)
    {
        char s= Character.toLowerCase(p);
        if (s == 'a'|| s =='e'||s=='i'||s=='o'||s=='u')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
        
}
