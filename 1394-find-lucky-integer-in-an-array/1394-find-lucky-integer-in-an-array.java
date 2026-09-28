class Solution {
    public int findLucky(int[] arr)
     {

        HashMap <Integer,Integer> map = new HashMap();
        int result  = -1;

        for(int n : arr)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }

       
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
            {
                    int key = entry.getKey();
                    int value = entry.getValue();
                    if(key == value)
                    {
                        result = Math.max(key,result);
                    }
            }

        return result;
        
    }
}