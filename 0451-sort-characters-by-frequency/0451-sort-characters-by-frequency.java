class Solution {
    public String frequencySort(String s) 
    {
        HashMap <Character,Integer> map = new HashMap();
        StringBuilder ans = new StringBuilder();

        for(int i = 0;i<s.length();i++)
        {
            char ch =s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
       List<Map.Entry<Character,Integer>> list1 = new ArrayList(map.entrySet()); 

        list1.sort((a, b) -> b.getValue() - a.getValue());

        
        for(int i = 0;i<list1.size();i++)
        {
            for(int j = 0;j<list1.get(i).getValue();j++)
            {
                ans.append(list1.get(i).getKey());
            }
            
        }

        return ans.toString();
    }
}