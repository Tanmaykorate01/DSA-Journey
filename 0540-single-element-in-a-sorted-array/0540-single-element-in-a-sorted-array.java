class Solution {
    public int singleNonDuplicate(int[] nums) 
    {
         int s = 0;
        int e = nums.length-1;

        while (s<=e)
        {
            int mid = s+(e-s)/2;
            if (s==e)
            {
                return nums[s];
            }
            int currentval = nums[mid];
            int prevvalue= -1;
            if (mid>0)
            {
                prevvalue = nums[mid-1];
            }
            int nextval = -1;

            if (mid<nums.length-1)
            {
                nextval = nums[mid+1];

            }

            if (currentval != prevvalue && currentval != nextval)
            {
                return currentval;
            }
            if (currentval!=prevvalue && currentval == nextval)
            {
                 int startind = mid;
                 if (((startind & 1) !=0))
                 {
                        e = mid -1;
                 }
                 else
                 {
                     s = mid+1;
                 }
            }
            else if(currentval == prevvalue && currentval != nextval)
            {
                int endinx = mid;
                if (((endinx & 1) !=0))
                {
                    s= mid+1;
                }
                else
                {
                    e = mid -1;
                }

            }
        }
        return  -1;
    }
}