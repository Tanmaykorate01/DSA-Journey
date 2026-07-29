class Solution {
    public String reverseStr(String s, int k) 
    {

        char op[] = s.toCharArray();

        int left = 0;
        int right = 0;


        for (int i = 0; i<op.length;i+=k*2) {

            left = i ;
            right =  Math.min(i+k-1,op.length-1);
            while (left < right) 
            {
                char temp = op[left];
                op[left] = op[right];
                op[right] = temp;


                left++;
                right--;

            }
        }
        String ans = new String(op);
        
        return ans;
    }
}