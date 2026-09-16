class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) 
    {
        HashMap<String,Integer> map = new HashMap();
        List<String> ans = new ArrayList();
        int minimumindex  = Integer.MAX_VALUE;

        for(int i = 0 ;i<list1.length;i++)
        {
            String ch = list1[i];
            map.put(ch,i);
        }

            for(int i = 0;i<list2.length;i++)
            {
                String word = list2[i];
                if(map.containsKey(word))
                {
                  int index = map.get(word) +i;
                  if(index < minimumindex)
                  {
                        ans.clear();
                        ans.add(word);
                  }
                  if(index == minimumindex)
                  {
                    ans.add(word);
                  }
                  minimumindex = Math.min(minimumindex,index);

                }
            }
        return ans.toArray(new String[0]);
    }
}