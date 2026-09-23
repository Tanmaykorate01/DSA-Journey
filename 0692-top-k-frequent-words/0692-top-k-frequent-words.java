class Solution {
    public List<String> topKFrequent(String[] words, int k) 
    {
        HashMap<String,Integer> map = new HashMap();
        List<String> ans = new ArrayList();

        for(int i = 0;i<words.length;i++)
        {
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        
        List<Map.Entry<String,Integer>> list1 = new ArrayList(map.entrySet()); 

                    list1.sort((a, b) -> 
                {
                if (a.getValue().equals(b.getValue())) 
                {
                    return a.getKey().compareTo(b.getKey());
                }

                return b.getValue() - a.getValue();
            });

        for(int i = 0;i<k;i++)
        {
            ans.add(list1.get(i).getKey());
        }
        return ans;
    }
}