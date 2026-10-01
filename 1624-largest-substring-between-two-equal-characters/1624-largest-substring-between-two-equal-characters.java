class Solution {
    public int maxLengthBetweenEqualCharacters(String s) 
    {

        HashMap<Character,Integer> map = new HashMap();

        int max  = -1;
        

        for(int i = 0;i<s.length(); i++)
        {

            char ch = s.charAt(i);
                    

            if(!map.containsKey(ch))
            {
                map.put(ch,i);
            }
            else
            {
                int index  = i -  map.get(ch) -1;

                max = Math.max(index,max);

            }
        }

        return max;
        
    }
}