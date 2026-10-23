class Solution {
    public int sumOfUnique(int[] nums) 
    {
        HashMap <Integer,Integer> map = new HashMap();
        int sum = 0;

        for(int n : nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);

        }
        for(int p : map.keySet())
        {
            if(map.get(p)== 1)
            {
                sum+=p;
            }
        }
             
        return sum;
    }
}