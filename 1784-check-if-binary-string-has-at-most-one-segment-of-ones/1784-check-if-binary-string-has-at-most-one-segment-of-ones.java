class Solution {
    public boolean checkOnesSegment(String s) 
    {
        int left  =0;
        int right = s.length()-1;


        for(int i =0;i<s.length();i++)
        {
            while(left < s.length() && s.charAt(left) =='1')
            {
                left++;
            }


            while(right>=0 && s.charAt(right)=='0')
            {
                right--;
            }
        }


        return left > right;
    }
}