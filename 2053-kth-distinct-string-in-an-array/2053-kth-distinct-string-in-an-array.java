class Solution {
    public String kthDistinct(String[] arr, int k) 
    {
       HashMap<String,Integer> map = new HashMap();

       for(String  i : arr)
       {
        map.put(i,map.getOrDefault(i , 0)+1);
       } 


      for(String ch : arr)
      {
        if(map.get(ch) ==1)
        {
            k--;
            if(k == 0)
            {
                return ch;
            }
        }
      }

      return  "";
       
    }
}