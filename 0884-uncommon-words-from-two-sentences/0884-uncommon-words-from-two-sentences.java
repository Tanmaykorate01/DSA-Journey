class Solution {
    public String[] uncommonFromSentences(String s1, String s2)
     {


            HashMap<String,Integer> map = new HashMap();
              String[] words = (s1 + " " + s2).split(" ");
              List <String> ans = new ArrayList();


              for(String word : words)
              {
                map.put(word,map.getOrDefault(word,0)+1);
              }

              for(Map.Entry<String,Integer> entry : map.entrySet())
              {
                if(entry.getValue()==1)
                {
                    ans.add(entry.getKey());
                }
              }
              
              String result[] = new String[ans.size()];
             for(int i = 0;i<ans.size();i++)
             {
                result[i] = ans.get(i);
             }

             return result;
        
    }
}