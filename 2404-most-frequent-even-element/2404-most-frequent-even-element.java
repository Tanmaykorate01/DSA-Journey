class Solution {
    public int mostFrequentEven(int[] nums)
     {
        HashMap <Integer,Integer> map = new HashMap();

        for(int num : nums)
        {
            if(num % 2 == 0)
            {
              map.put(num,map.getOrDefault(num,0)+1);

            }

        }

        int highf = -1;
        int value= -1;

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() > highf)
            {
                highf = entry.getValue();
                value = entry.getKey();
            }
            else if( entry.getValue() == highf)
            {
                   if(entry.getKey() < value)
                   {
                    value =  entry.getKey();
                   }
                   
            }

        }
        return value;
    }
}