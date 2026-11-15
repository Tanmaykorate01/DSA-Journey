class Solution {
    public int numOfSubarrays(int[] arr) 
    {
        
       int mod = 1000000007;
       int count  =0;
       int even =1;
       int odd = 0;
       int prefixsum = 0;


       for(int n : arr)
       {

            prefixsum += n;

            if(prefixsum % 2!=0)
            {
                count+=even;
            odd++;
            }
            else
            {
                count +=odd;
                even++;
            }


            count %=  mod;
       }


       

        return count;
        
    }
}