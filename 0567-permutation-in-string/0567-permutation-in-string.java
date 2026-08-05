class Solution {

    private boolean ComparedFreq(int[] count1, int[] count2)
    {
        for (int i = 0; i < 26; i++)
        {
            if (count1[i] != count2[i])
            {
                return false;
            }
        }
        return true;
    }   // <-- This brace was missing

    public boolean checkInclusion(String s1, String s2)
    {
        if (s1.length() > s2.length())
        {
            return false;
        }

        int count1[] = new int[26];
        for (int i = 0; i < s1.length(); i++)
        {
            char ch = s1.charAt(i);
            count1[ch - 'a']++;
        }

        int i = 0;
        int count2[] = new int[26];
        int windowlength = s1.length();

        for (i = 0; i < windowlength; i++)
        {
            char ch = s2.charAt(i);
            count2[ch - 'a']++;
        }

        if (ComparedFreq(count1, count2) == true)
        {
            return true;
        }
        else
        {
            while (i < s2.length())
            {
                // for adding new char
                char newchar = s2.charAt(i);
                count2[newchar - 'a']++;

                // removing old char
                int oldcharindex = i - windowlength;
                char oldchar = s2.charAt(oldcharindex);
                int oldcharfreqindex = oldchar - 'a';

                count2[oldcharfreqindex]--;

                if (ComparedFreq(count1, count2) == true)
                {
                    return true;
                }

                i++;
            }
        }

        return false;
    }
}