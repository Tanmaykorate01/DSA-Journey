class Solution {
    public static int[] sortedSquares(int[] nums)
     {
        int sqrt[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            sqrt[i] = nums[i]*nums[i];
        }
        
        
        for(int j=0;j<nums.length;j++)
        for(int i =0;i<nums.length-1;i++)
        {
            if(sqrt[i]>sqrt[i+1])
            {
                int temp = sqrt[i];
                sqrt[i]=sqrt[i+1];
                sqrt[i+1]= temp;
            }
        }
        return sqrt;
    }
}